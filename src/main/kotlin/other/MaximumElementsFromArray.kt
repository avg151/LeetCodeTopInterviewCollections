package other

/**
 * Given a non-empty array of integers nums. Find 3 max elements
 */
class MaximumElementsFromArray {

    fun findMaximumElements(inputArray: IntArray): IntArray {
        if (inputArray.size <= 3) {
            return inputArray
        }
        return sort(inputArray).takeLast(3).toIntArray()
    }

    private fun sort(inputArray: IntArray): IntArray {
        for (i in inputArray.size - 1 downTo 0) {
            for (j in 0 until i) {
                if (inputArray[j] > inputArray[j + 1]) {
                    swapWithNext(inputArray, j)
                }
            }
        }
        return inputArray
    }

    private fun swapWithNext(nums: IntArray, swapIndex: Int) {
        val tmp = nums[swapIndex]
        nums[swapIndex] = nums[swapIndex + 1]
        nums[swapIndex + 1] = tmp
    }

}