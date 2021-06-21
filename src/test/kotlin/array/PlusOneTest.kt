package array

import org.junit.Assert
import org.junit.Test


class PlusOneTest {

    @Test
    fun plusOne1() {
        val input = arrayOf(1, 2, 3).toIntArray()
        val expected = arrayOf(1, 2, 4).toIntArray()

        Assert.assertArrayEquals(expected, PlusOne().plusOne(input))
    }

    @Test
    fun plusOne2() {
        val input = arrayOf(4, 3, 2, 1).toIntArray()
        val expected = arrayOf(4, 3, 2, 2).toIntArray()

        Assert.assertArrayEquals(expected, PlusOne().plusOne(input))
    }

    @Test
    fun plusOne3() {
        val input = arrayOf(0).toIntArray()
        val expected = arrayOf(1).toIntArray()

        Assert.assertArrayEquals(expected, PlusOne().plusOne(input))
    }

    @Test
    fun plusOne4() {
        val input = arrayOf(9).toIntArray()
        val expected = arrayOf(1, 0).toIntArray()

        Assert.assertArrayEquals(expected, PlusOne().plusOne(input))
    }

    @Test
    fun plusOne5() {
        val input = arrayOf(9, 9).toIntArray()
        val expected = arrayOf(1, 0, 0).toIntArray()

        Assert.assertArrayEquals(expected, PlusOne().plusOne(input))
    }

    @Test
    fun plusOne6() {
        val input = arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0).toIntArray()
        val expected = arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 1).toIntArray()

        Assert.assertArrayEquals(expected, PlusOne().plusOne(input))
    }

}