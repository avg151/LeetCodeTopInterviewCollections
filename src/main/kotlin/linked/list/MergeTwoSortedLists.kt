package linked.list

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/771/
 *
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 *
 */
class MergeTwoSortedLists {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? = when {
        l1 == null -> l2
        l2 == null -> l1
        l1.`val` < l2.`val` -> ListNode(l1.`val`, mergeTwoLists(l1.next, l2))
        else -> ListNode(l2.`val`, mergeTwoLists(l1, l2.next))
    }

}