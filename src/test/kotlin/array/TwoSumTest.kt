package array

import org.junit.Assert
import org.junit.Test

class TwoSumTest {

    @Test
    fun twoSum() {
        val expected = intArrayOf(0, 1)


        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val actual = TwoSum().twoSum(nums, target)

        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum2() {
        val expected = intArrayOf(1, 2)


        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val actual = TwoSum().twoSum(nums, target)

        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum3() {
        val expected = intArrayOf(0, 1)


        val nums = intArrayOf(3, 3)
        val target = 6
        val actual = TwoSum().twoSum(nums, target)

        Assert.assertArrayEquals(expected, actual)
    }

}