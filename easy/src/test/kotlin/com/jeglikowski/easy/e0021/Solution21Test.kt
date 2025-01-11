package com.jeglikowski.easy.e0021

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution21Test {

    private fun listNodeToList(node: ListNode?): List<Int> {
        val result = mutableListOf<Int>()
        var current = node
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        return result
    }

    @Test
    fun mergeTwoLists_returnsMergedSortedList_case1() {
        val solution = Solution21()
        val l1 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(4)
            }
        }
        val l2 = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }
        val result = solution.mergeTwoLists(l1, l2)
        assertEquals(listOf(1, 1, 2, 3, 4, 4), listNodeToList(result))
    }

    @Test
    fun mergeTwoLists_returnsMergedSortedList_case2() {
        val solution = Solution21()
        val l1 = ListNode(1)
        val l2 = ListNode(2)
        val result = solution.mergeTwoLists(l1, l2)
        assertEquals(listOf(1, 2), listNodeToList(result))
    }

    @Test
    fun mergeTwoLists_returnsList1_whenList2IsNull() {
        val solution = Solution21()
        val l1 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(4)
            }
        }
        val result = solution.mergeTwoLists(l1, null)
        assertEquals(listOf(1, 2, 4), listNodeToList(result))
    }

    @Test
    fun mergeTwoLists_returnsList2_whenList1IsNull() {
        val solution = Solution21()
        val l2 = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }
        val result = solution.mergeTwoLists(null, l2)
        assertEquals(listOf(1, 3, 4), listNodeToList(result))
    }

    @Test
    fun mergeTwoLists_returnsNull_whenBothListsAreNull() {
        val solution = Solution21()
        val result = solution.mergeTwoLists(null, null)
        assertEquals(emptyList<Int>(), listNodeToList(result))
    }
}