package array

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
class RotateArray {

    fun rotate(nums: IntArray, k: Int): Unit {
        val rotation = k % nums.size
        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, rotation - 1)
        reverse(nums, rotation, nums.size - 1)
    }

    fun reverse(nums: IntArray, start: Int, end: Int) {
        var l = start
        var r = end
        while (l < r) {
            nums[l] = nums[r].also { nums[r] = nums[l] }
            l++
            r--
        }
    }
}