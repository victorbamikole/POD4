fun main() {
    println()
    println("CREATE A BOY")
    println()
    println("Enter the name")
    val name = readLine()!!
    println("Enter the age")
    val age = readLine()!!.toInt()
    println("Enter the height")
    val height = readLine()!!.toInt()

    val bigBoy = Boy(name, age, height)

    val smallBoy = Boy("Lad", 15, 5)

    val club = Club("bigBoysClub")

    val jack = ClubManager(club, "Jack")

    jack.addMemberToClub(bigBoy)
    println("+++++++++++++++++++++++++++++++++++++++++++")

    jack.addMemberToClub(smallBoy)

}