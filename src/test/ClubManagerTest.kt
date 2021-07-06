package test

import Boy
import Club
import ClubManager
import org.junit.Assert.*
import org.junit.Test

class ClubManagerTest {
    val club = Club("Decagon")
    val club2 = Club("EdoTechPark")
    val boy = Boy("John", 14, 5)

    val boy2 = Boy("John Doe", 20, 7)

    val clubManager = ClubManager(club, "Jack")

    val clubManager2 = ClubManager(club2, "Jacky")

    @Test
    fun testClubManagerCanAddMember() {
        assertEquals(0, club.getNumbersOfMembers())
        clubManager.addMemberToClub(boy2)
        assertEquals(1, club.getNumbersOfMembers())
    }

    @Test
    fun testIfManagerDetailsIsCorrect() {
        assertEquals("The club manager's name is Jacky and he manages EdoTechPark", clubManager2.getClubManagerDetails())
    }

    @Test
    fun testIfManagerDetailsAreCorrect() {
        assertEquals("The club manager's name is Jack and he manages Decagon", clubManager.getClubManagerDetails())
    }
}