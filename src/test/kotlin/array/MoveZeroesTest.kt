package array

import org.junit.Assert
import org.junit.Test

class MoveZeroesTest {

    @Test
    fun moveZeroes1() {
        val input = arrayOf(0, 1, 0, 3, 12).toIntArray()
        val expected = arrayOf(1, 3, 12, 0, 0).toIntArray()

        MoveZeroes().moveZeroes(input)

        Assert.assertArrayEquals(expected,input )
    }

    @Test
    fun moveZeroes2() {
        val input = arrayOf(0).toIntArray()
        val expected = arrayOf(0).toIntArray()

        MoveZeroes().moveZeroes(input)

        Assert.assertArrayEquals(expected, input)
    }
}