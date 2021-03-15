package array

import org.junit.Test

import org.junit.Assert.*

class ContainsDuplicateTest {

    @Test
    fun containsDuplicateTrue() {
        val inputTrue = arrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2).toIntArray()
        assertTrue(ContainsDuplicate().containsDuplicate(inputTrue))
    }

    @Test
    fun containsDuplicateFalse() {
        val inputFalse = arrayOf(1, 2, 3, 4).toIntArray()
        assertFalse(ContainsDuplicate().containsDuplicate(inputFalse))
    }

}