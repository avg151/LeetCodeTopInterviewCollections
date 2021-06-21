package array

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/559/
 *
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in
 * the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 */
class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        var strValue = ""
        digits.map { strValue += it }
        return strValue.toBigDecimal().inc().toString().toCharArray().map { it.toString().toInt() }.toIntArray()
    }

}