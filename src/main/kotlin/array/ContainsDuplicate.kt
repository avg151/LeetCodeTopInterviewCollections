package array

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false
 * if every element is distinct.
 *
 */
class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size != nums.toSet().size
    }

}