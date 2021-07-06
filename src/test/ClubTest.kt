package test

import Boy
import Club
import org.junit.Assert.*
import org.junit.Test

class ClubTest {
    val club= Club("Decagon")
    val boy = Boy("John", 14, 5)

    val boy2 = Boy("John Doe", 20, 7)


    @Test
    fun testAddMemberMethod(){
        assertEquals(0, club.getNumbersOfMembers())
        club.addMember(boy2)
        club.addMember(boy2)
        club.addMember(boy2)
        club.addMember(boy2)
        club.addMember(boy)
        assertEquals(5, club.getNumbersOfMembers())
    }

}