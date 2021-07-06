package test

import Boy
import org.junit.Assert.*
import org.junit.Test

class BoyTest {

    val boy = Boy("John", 14, 5)

    val boy2 = Boy("John Doe", 20, 7)

    @Test
    fun checkIfTheCorrectDetailsAreReturned() {
        assertEquals("John, 14, 5", boy.getDetails())
        assertEquals("John Doe, 20, 7", boy2.getDetails())
    }

    @Test
    fun checkIfTheCorrectDetailsAreReturned2() {
        assertEquals("John Doe, 20, 7", boy2.getDetails())
    }

//    @Test
//    fun checkThatTheWrongDetailsAreReturned() {
//        assertFalse(boy.name == "Steve")
//    }
}