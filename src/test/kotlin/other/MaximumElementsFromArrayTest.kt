package other

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class MaximumElementsFromArrayTest {

    @Test
    fun findMaximumElementsTest2() {
        val a = emptyArray<Int>().toIntArray()
        val result = emptyArray<Int>().toIntArray()

        assertArrayEquals(result, MaximumElementsFromArray().findMaximumElements(a))
    }

    @Test
    fun findMaximumElementsTest4() {
        val a = arrayOf(1, 2).toIntArray()
        val result = arrayOf(1, 2).toIntArray()

        assertArrayEquals(result, MaximumElementsFromArray().findMaximumElements(a))
    }

    @Test
    fun findMaximumElementsTest1() {
        val a = arrayOf(1, 2, 3, 4, 5).toIntArray()
        val result = arrayOf(3, 4, 5).toIntArray()

        assertArrayEquals(result, MaximumElementsFromArray().findMaximumElements(a))
    }

    @Test
    fun findMaximumElementsTest3() {
        val a = arrayOf(3, 3, 3).toIntArray()
        val result = arrayOf(3, 3, 3).toIntArray()

        assertArrayEquals(result, MaximumElementsFromArray().findMaximumElements(a))
    }

    @Test
    fun findMaximumElementsTest6() {
        val a = arrayOf(1, 2, 3, 4, 5, 5).toIntArray()
        val result = arrayOf(4, 5, 5).toIntArray()

        assertArrayEquals(result, MaximumElementsFromArray().findMaximumElements(a))
    }

    @Test
    fun findMaximumElementsTest7() {
        val a = arrayOf(7, 2, 1, 3, 4, 5, 5).toIntArray()
        val result = arrayOf(5, 5, 7).toIntArray()

        assertArrayEquals(result, MaximumElementsFromArray().findMaximumElements(a))
    }
    
}