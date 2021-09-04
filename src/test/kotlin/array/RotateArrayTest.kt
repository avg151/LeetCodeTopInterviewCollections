package array

import org.junit.Assert
import org.junit.Test

class RotateArrayTest {

    @Test
    fun rotate1() {
        val input = arrayOf(1, 2, 3, 4, 5, 6, 7).toIntArray()
        val expected = arrayOf(5, 6, 7, 1, 2, 3, 4).toIntArray()

        RotateArray().rotate(input, 3)

        Assert.assertArrayEquals(expected, input)
    }

    @Test
    fun rotate2() {
        val input = arrayOf(-1,-100,3,99).toIntArray()
        val expected = arrayOf(3,99,-1,-100).toIntArray()

        RotateArray().rotate(input, 2)

        Assert.assertArrayEquals(expected, input)
    }

}