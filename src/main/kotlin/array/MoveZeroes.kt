package array

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
 *
 * Given an integer array nums, move all 0's to the end of it whilemaintaining
 * the relative orderof the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 */
class MoveZeroes {

    fun moveZeroes(nums: IntArray) {
        var nextZeroIndex = nums.size - 1
        if (nums.size > 1) {
            for (i in (nums.size - 1) downTo 0) {
                if (nums[i] == 0 && i != (nums.size - 1)) {
                    moveForward(nums, i, nextZeroIndex)
                    nextZeroIndex--
                }
            }
        }
    }

    private fun moveForward(nums: IntArray, from: Int, to: Int) {
        for (i in from until to) {
            swapWithNext(nums, i)
        }
    }

    private fun swapWithNext(nums: IntArray, swapIndex: Int) {
        val tmp = nums[swapIndex]
        nums[swapIndex] = nums[swapIndex + 1]
        nums[swapIndex + 1] = tmp
    }

}