class ClubManager (private val club: Club, private val name: String) {

    fun addMemberToClub(member: Boy) {
        club.addMember(member)
    }

    fun getClubManagerDetails(): String {
        return "The club manager's name is $name and he manages ${club.name}"
    }
}