package array

import java.util.HashMap

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = HashMap()

        for (i in nums.indices) {
            val expectedNumber = target - nums[i]

            if (map.containsKey(expectedNumber)) {
                val index = map[expectedNumber]!!
                return intArrayOf(index, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf(0)
    }

}