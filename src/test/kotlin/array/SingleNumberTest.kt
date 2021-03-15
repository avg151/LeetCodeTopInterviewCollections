package array

import org.junit.Test

import org.junit.Assert.*

class SingleNumberTest {

    @Test
    fun singleNumber0() {
        val input0 = arrayOf(2, 2, 1).toIntArray()
        assertEquals(1, SingleNumber().singleNumber(input0))
    }

    @Test
    fun singleNumber1() {
        val input1 = arrayOf(4, 1, 2, 1, 2).toIntArray()
        assertEquals(4, SingleNumber().singleNumber(input1))
    }

    @Test
    fun singleNumber2() {
        val input2 = arrayOf(1).toIntArray()
        assertEquals(1, SingleNumber().singleNumber(input2))
    }

}