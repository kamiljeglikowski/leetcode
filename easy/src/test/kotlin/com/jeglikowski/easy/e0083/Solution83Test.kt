package com.jeglikowski.easy.e0083

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution83Test {

    @Test
    fun deleteDuplicates_returnsCorrectResult_case1() {
        val solution = Solution83()
        val head = ListNode(1)
        head.next = ListNode(1)
        head.next!!.next = ListNode(2)
        val result = solution.deleteDuplicates(head)
        assertEquals(1, result?.`val`)
        assertEquals(2, result?.next?.`val`)
        assertEquals(null, result?.next?.next)
    }

    @Test
    fun deleteDuplicates_returnsCorrectResult_case2() {
        val solution = Solution83()
        val head = ListNode(1)
        head.next = ListNode(1)
        head.next!!.next = ListNode(2)
        head.next!!.next!!.next = ListNode(3)
        head.next!!.next!!.next!!.next = ListNode(3)
        val result = solution.deleteDuplicates(head)
        assertEquals(1, result?.`val`)
        assertEquals(2, result?.next?.`val`)
        assertEquals(3, result?.next?.next?.`val`)
        assertEquals(null, result?.next?.next?.next)
    }

    @Test
    fun deleteDuplicates_returnsCorrectResult_case3() {
        val solution = Solution83()
        val head = ListNode(1)
        head.next = ListNode(1)
        head.next!!.next = ListNode(1)
        val result = solution.deleteDuplicates(head)
        assertEquals(1, result?.`val`)
        assertEquals(null, result?.next)
    }

    @Test
    fun deleteDuplicates_returnsCorrectResult_forEmptyList() {
        val solution = Solution83()
        val result = solution.deleteDuplicates(null)
        assertEquals(null, result)
    }

    @Test
    fun deleteDuplicates_returnsCorrectResult_forSingleElementList() {
        val solution = Solution83()
        val head = ListNode(1)
        val result = solution.deleteDuplicates(head)
        assertEquals(1, result?.`val`)
        assertEquals(null, result?.next)
    }
}