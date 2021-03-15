package array

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 */
class SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        nums.toSet().map { numFromSet ->
            if (nums.count { numFromArray -> numFromArray == numFromSet } == 1) {
                return nums.filter { numFromArray -> numFromArray == numFromSet }[0]
            }
        }
        throw IllegalStateException()
    }

}