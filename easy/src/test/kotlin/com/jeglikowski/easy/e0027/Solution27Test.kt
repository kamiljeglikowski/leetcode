package com.jeglikowski.easy.e0027

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution27Test {

    @Test
    fun removeElement_removesCorrectElements_case1() {
        val solution = Solution27()
        val nums = intArrayOf(3, 2, 2, 3)
        val result = solution.removeElement(nums, 3)
        assertEquals(2, result)
    }

    @Test
    fun removeElement_removesCorrectElements_case2() {
        val solution = Solution27()
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val result = solution.removeElement(nums, 2)
        assertEquals(5, result)
    }

    @Test
    fun removeElement_removesCorrectElements_case3() {
        val solution = Solution27()
        val nums = intArrayOf(1)
        val result = solution.removeElement(nums, 1)
        assertEquals(0, result)
    }

    @Test
    fun removeElement_removesCorrectElements_case4() {
        val solution = Solution27()
        val nums = intArrayOf(4, 5)
        val result = solution.removeElement(nums, 5)
        assertEquals(1, result)
    }

    @Test
    fun removeElement_removesCorrectElements_case5() {
        val solution = Solution27()
        val nums = intArrayOf(2, 2, 2)
        val result = solution.removeElement(nums, 2)
        assertEquals(0, result)
    }
}