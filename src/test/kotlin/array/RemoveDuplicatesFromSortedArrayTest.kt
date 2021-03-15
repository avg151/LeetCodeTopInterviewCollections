package array

import org.junit.Test
import kotlin.test.assertEquals
import array.RemoveDuplicatesFromSortedArray as Solution

internal class RemoveDuplicatesFromSortedArrayTest {

    private val input = arrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4).toIntArray()
    private val expected = arrayOf(0, 1, 2, 3, 4).size

    @Test
    fun removeDuplicatesV0() {
        assertEquals(expected, Solution().removeDuplicatesV0(input))
    }

    @Test
    fun removeDuplicatesV1() {
        assertEquals(expected, Solution().removeDuplicatesV1(input))
    }

}