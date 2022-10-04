package strings

import org.junit.Test

import org.junit.Assert.*

class ValidAnagramTest {

    @Test
    fun isAnagram1() {
        val s = "anagram"
        val t = "nagaram"

        assertTrue(ValidAnagram().isAnagram(s, t))
    }

    @Test
    fun isAnagram2() {
        val s = "rat"
        val t = "car"

        assertFalse(ValidAnagram().isAnagram(s, t))
    }
}