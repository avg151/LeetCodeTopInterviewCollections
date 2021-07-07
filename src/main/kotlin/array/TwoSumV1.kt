package array

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
 *
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in
 * the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 */
class TwoSumV1 {

    private var isFound = false

    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.mapIndexed { i1, v1 ->
            nums.mapIndexed { i2, v2 ->
                if (i1 != i2) {
                    when {
                        target == 0 -> targetEqualZero(v1, v2)
                        target > 0 -> targetAboveZero(v1, v2, target)
                        target < 0 -> targetLessZero(v1, v2, target)
                    }
                    if (isFound) {
                        return arrayOf(i1, i2).toIntArray()
                    }
                }
            }
        }
        throw IllegalArgumentException()
    }

    private fun targetEqualZero(v1: Int, v2: Int) {
        if (v1 == 0 && v2 == 0 || v1 == -v2) isFound = true
    }

    private fun targetAboveZero(v1: Int, v2: Int, target: Int) {
        when {
            v1 >= 0 && v2 >= 0 -> targetAboveZeroAndBothAboveZero(v1, v2, target)
            v1 >= 0 && v2 <= 0 || v1 <= 0 && v2 >= 0 ->
                targetAboveZeroAndV1AboveZeroV2LessZero(v1, v2, target)
        }
    }

    private fun targetLessZero(v1: Int, v2: Int, target: Int) {
        when {
            v1 <= 0 && v2 <= 0 -> targetLessZeroAndBothLessZero(v1, v2, target)
            v1 >= 0 && v2 <= 0 || v1 <= 0 && v2 >= 0 ->
                targetLessZeroAndV1AboveZeroV2LessZero(v1, v2, target)
        }
    }

    private fun targetAboveZeroAndBothAboveZero(v1: Int, v2: Int, target: Int) {
        if (v1 <= target && v2 <= target) {
            if (v1 + v2 == target) {
                isFound = true
            }
        }
    }

    private fun targetLessZeroAndBothLessZero(v1: Int, v2: Int, target: Int) {
        if (v1 >= target && v2 >= target) {
            if (v1 + v2 == target) {
                isFound = true
            }
        }
    }

    private fun targetAboveZeroAndV1AboveZeroV2LessZero(v1: Int, v2: Int, target: Int) {
        if (v1 >= target) {
            if (v1 + v2 == target) {
                isFound = true
            }
        }
    }

    private fun targetLessZeroAndV1AboveZeroV2LessZero(v1: Int, v2: Int, target: Int) {
        if (v1 <= target) {
            if (v1 + v2 == target) {
                isFound = true
            }
        }
    }

}