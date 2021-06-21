package array

import org.junit.Test

import org.junit.Assert.*

class BestTimeToBuyAndSellStockIITest {

    @Test
    fun maxProfit1() {
        val input = arrayOf(7, 1, 5, 3, 6, 4).toIntArray()
        val expected = 7

        assertEquals(expected, BestTimeToBuyAndSellStockII().maxProfit(input))
    }

    @Test
    fun maxProfit2() {
        val input = arrayOf(7, 1, 5, 6, 3, 6, 4).toIntArray()
        val expected = 8

        assertEquals(expected, BestTimeToBuyAndSellStockII().maxProfit(input))
    }

    @Test
    fun maxProfit3() {
        val input = arrayOf(1, 2, 3, 4, 5).toIntArray()
        val expected = 4

        assertEquals(expected, BestTimeToBuyAndSellStockII().maxProfit(input))
    }

    @Test
    fun maxProfit4() {
        val input = arrayOf(7, 6, 4, 3, 1).toIntArray()
        val expected = 0

        assertEquals(expected, BestTimeToBuyAndSellStockII().maxProfit(input))
    }

    @Test
    fun maxProfit5() {
        val input = arrayOf(1, 2).toIntArray()
        val expected = 1

        assertEquals(expected, BestTimeToBuyAndSellStockII().maxProfit(input))
    }
}