package array

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TwoSumV1Test {

    @Test
    fun twoSum1() {
        val input = arrayOf(2, 7, 11, 15).toIntArray()
        val target = 9

        val expected = arrayOf(0, 1).toIntArray()

        assertArrayEquals(expected, TwoSumV1().twoSum(input, target))
    }

    @Test
    fun twoSum2() {
        val input = arrayOf(3, 2, 4).toIntArray()
        val target = 6

        val expected = arrayOf(1, 2).toIntArray()

        assertArrayEquals(expected, TwoSumV1().twoSum(input, target))
    }

    @Test
    fun twoSum3() {
        val input = arrayOf(3, 3).toIntArray()
        val target = 6

        val expected = arrayOf(0, 1).toIntArray()

        assertArrayEquals(expected, TwoSumV1().twoSum(input, target))
    }

    @Test
    fun twoSum4() {
        val input = arrayOf(-3, 4, 3, 90).toIntArray()
        val target = 0

        val expected = arrayOf(0, 2).toIntArray()

        assertArrayEquals(expected, TwoSumV1().twoSum(input, target))
    }

    @Test
    fun twoSum5() {
        val input = arrayOf(0, 3, -3, 4, -1).toIntArray()
        val target = -1

        val expected = arrayOf(0, 4).toIntArray()

        assertArrayEquals(expected, TwoSumV1().twoSum(input, target))
    }
}