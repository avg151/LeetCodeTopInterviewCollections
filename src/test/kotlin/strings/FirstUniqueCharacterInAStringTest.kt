package strings

import org.junit.Test

import org.junit.Assert.*

class FirstUniqueCharacterInAStringTest {

    @Test
    fun firstUniqChar0() {
        val input = "leetcode"
        assertEquals(0, FirstUniqueCharacterInAString().firstUniqChar(input))
    }

    @Test
    fun firstUniqChar1() {
        val input = "loveleetcode"
        assertEquals(2, FirstUniqueCharacterInAString().firstUniqChar(input))
    }

    @Test
    fun firstUniqChar2() {
        val input = "ll"
        assertEquals(-1, FirstUniqueCharacterInAString().firstUniqChar(input))
    }
}