package com.jeglikowski.easy.e0108

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

class Solution108Test {

    @Test
    fun sortedArrayToBST_returnsCorrectTree_case1() {
        val solution = Solution108()
        val nums = intArrayOf(-10, -5, 0, 4, 23)
        val result = solution.sortedArrayToBST(nums)
        assertNotNull(result)
        assertEquals(0, result?.`val`)
        assertEquals(-10, result?.left?.`val`)
        assertEquals(4, result?.right?.`val`)
        assertEquals(-5, result?.left?.right?.`val`)
        assertEquals(23, result?.right?.right?.`val`)
    }

    @Test
    fun sortedArrayToBST_returnsCorrectTree_case2() {
        val solution = Solution108()
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val result = solution.sortedArrayToBST(nums)
        assertNotNull(result)
        assertEquals(4, result?.`val`)
        assertEquals(2, result?.left?.`val`)
        assertEquals(6, result?.right?.`val`)
        assertEquals(1, result?.left?.left?.`val`)
        assertEquals(3, result?.left?.right?.`val`)
        assertEquals(5, result?.right?.left?.`val`)
        assertEquals(7, result?.right?.right?.`val`)
    }

    @Test
    fun sortedArrayToBST_returnsSingleElementTree_whenSingleElementArray() {
        val solution = Solution108()
        val nums = intArrayOf(1)
        val result = solution.sortedArrayToBST(nums)
        assertNotNull(result)
        assertEquals(1, result?.`val`)
        assertNull(result?.left)
        assertNull(result?.right)
    }
}
