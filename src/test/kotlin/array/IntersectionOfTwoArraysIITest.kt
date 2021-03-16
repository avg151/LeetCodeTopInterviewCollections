package array

import org.junit.Test

import org.junit.Assert.*

class IntersectionOfTwoArraysIITest {

    @Test
    fun intersect0() {
        val input1 = arrayOf(1, 2, 2, 1).toIntArray()
        val input2 = arrayOf(2, 2).toIntArray()
        val expected = arrayOf(2, 2).toIntArray()

        assertArrayEquals(expected, IntersectionOfTwoArraysII().intersect(input1, input2))
    }

    @Test
    fun intersect1() {
        val input1 = arrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4).toIntArray()
        val input2 = arrayOf(0, 1, 2, 3, 4).toIntArray()
        val expected = arrayOf(0, 1, 2, 3, 4).toIntArray()

        assertArrayEquals(expected, IntersectionOfTwoArraysII().intersect(input1, input2))
    }

}