package linked.list

import org.junit.Assert.assertEquals
import org.junit.Test

class MergeTwoSortedListsTest {

    @Test
    fun mergeTwoLists() {
        val input1 = ListNode(1, ListNode(2, ListNode(4, null)))
        val input2 = ListNode(1, ListNode(3, ListNode(4, null)))
        val expected = ListNode(1, ListNode(1, ListNode(2, ListNode(3,
            ListNode(4, ListNode(4, null))))))

        assertEquals(expected, MergeTwoSortedLists().mergeTwoLists(input1, input2))
    }

}