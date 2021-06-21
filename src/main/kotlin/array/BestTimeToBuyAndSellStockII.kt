package array

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve. You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 *
 */
class BestTimeToBuyAndSellStockII {

    fun maxProfit(prices: IntArray): Int {
        var i = 0
        var minInRange: Int
        var maxInRange: Int
        var maxProfit = 0

        while (i < prices.size - 1) {
            while (i < prices.size - 1 && prices[i] >= prices[i + 1]) {
                i++
            }
            minInRange = prices[i]

            while (i < prices.size - 1 && prices[i] <= prices[i + 1]) {
                i++
            }
            maxInRange = prices[i]

            maxProfit += maxInRange - minInRange
        }
        return maxProfit
    }

}