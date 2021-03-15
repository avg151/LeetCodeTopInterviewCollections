package array

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns
 * the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
 * extra memory.
 */

class Array01RemoveDuplicatesFromSortedArray {

    fun removeDuplicatesV0(nums: IntArray): Int {
        return nums.toSet().size
    }

    fun removeDuplicatesV1(nums: IntArray): Int {
        val mutableList = nums.toMutableList()

        var tmp: Int? = null
        val iterator = mutableList.iterator()
        while (iterator.hasNext()) {
            if (tmp == null) {
                tmp = iterator.next()
            } else {
                val next = iterator.next()
                if (next == tmp) {
                    iterator.remove()
                } else {
                    tmp = next
                }
            }
        }
        return mutableList.size
    }

}