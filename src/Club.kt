class Club (val name: String) {
    private val members: ArrayList<Boy> = ArrayList()

    fun addMember(member: Boy) {
        if (member.age < 18) {
            println("Sorry ${member.name} you are too young to join the big boys club, come back when you are 18")
            return
        }
        members.add(member)
        println("Congratulation ${member.name}, you  have been added to the big boys club")
    }

    fun getNumbersOfMembers(): Int = members.size
}