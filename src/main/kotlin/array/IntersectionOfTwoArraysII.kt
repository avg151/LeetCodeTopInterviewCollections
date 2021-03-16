package array

import kotlin.math.min

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
 *
 * Given two arrays, write a function to compute their intersection.
 */
class IntersectionOfTwoArraysII {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        if (nums1.isEmpty()) return nums2
        if (nums2.isEmpty()) return nums1

        val result = mutableListOf<Int>()
        val iterator1 = nums1.toSet().iterator()
        while (iterator1.hasNext()) {
            val next = iterator1.next()
            repeat(min(nums1.count { it == next }, nums2.count { it == next })) {
                result.add(next)
            }
        }

        return result.toIntArray()
    }

}