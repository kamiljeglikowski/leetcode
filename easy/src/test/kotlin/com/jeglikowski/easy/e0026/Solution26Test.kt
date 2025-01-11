package com.jeglikowski.easy.e0026

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution26Test {

    @Test
    fun removeDuplicates_returnsCorrectLength_case1() {
        val solution = Solution26()
        val nums = intArrayOf(1, 1, 2)
        val result = solution.removeDuplicates(nums)
        assertEquals(2, result)
    }

    @Test
    fun removeDuplicates_returnsCorrectLength_case2() {
        val solution = Solution26()
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val result = solution.removeDuplicates(nums)
        assertEquals(5, result)
    }

    @Test
    fun removeDuplicates_returnsCorrectLength_forEmptyArray() {
        val solution = Solution26()
        val nums = intArrayOf()
        val result = solution.removeDuplicates(nums)
        assertEquals(0, result)
    }

    @Test
    fun removeDuplicates_returnsCorrectLength_forSingleElementArray() {
        val solution = Solution26()
        val nums = intArrayOf(1)
        val result = solution.removeDuplicates(nums)
        assertEquals(1, result)
    }

    @Test
    fun removeDuplicates_modifiesArrayCorrectly() {
        val solution = Solution26()
        val nums = intArrayOf(1, 1, 2)
        solution.removeDuplicates(nums)
        assertEquals(1, nums[0])
        assertEquals(2, nums[1])
    }
}