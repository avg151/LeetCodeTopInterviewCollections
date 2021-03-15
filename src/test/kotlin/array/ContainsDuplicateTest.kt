package array

import org.junit.Test

import org.junit.Assert.*

class ContainsDuplicateTest {

    private val inputTrue = arrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2).toIntArray()
    private val inputFalse = arrayOf(1, 2, 3, 4).toIntArray()


    @Test
    fun containsDuplicateTrue() {
        assertTrue(ContainsDuplicate().containsDuplicate(inputTrue))
    }

    @Test
    fun containsDuplicateFalse() {
        assertFalse(ContainsDuplicate().containsDuplicate(inputFalse))
    }

}