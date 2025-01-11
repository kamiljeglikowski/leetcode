package com.jeglikowski.easy.e0035

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution35Test {

    @Test
    fun searchInsert_returnsCorrectIndex_case1() {
        val solution = Solution35()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val result = solution.searchInsert(nums, target)
        assertEquals(2, result)
    }

    @Test
    fun searchInsert_returnsCorrectIndex_case2() {
        val solution = Solution35()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val result = solution.searchInsert(nums, target)
        assertEquals(1, result)
    }

    @Test
    fun searchInsert_returnsCorrectIndex_case3() {
        val solution = Solution35()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val result = solution.searchInsert(nums, target)
        assertEquals(4, result)
    }

    @Test
    fun searchInsert_returnsCorrectIndex_case4() {
        val solution = Solution35()
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 0
        val result = solution.searchInsert(nums, target)
        assertEquals(0, result)
    }

    @Test
    fun searchInsert_returnsCorrectIndex_forEmptyArray() {
        val solution = Solution35()
        val nums = intArrayOf()
        val target = 5
        val result = solution.searchInsert(nums, target)
        assertEquals(0, result)
    }
}