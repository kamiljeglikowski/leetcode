package com.jeglikowski.easy.e0066

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class Solution66Test {

    @Test
    fun plusOne_returnsCorrectResult_case1() {
        val solution = Solution66()
        val digits = intArrayOf(1, 2, 3)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(1, 2, 4), result)
    }

    @Test
    fun plusOne_returnsCorrectResult_case2() {
        val solution = Solution66()
        val digits = intArrayOf(4, 3, 2, 1)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(4, 3, 2, 2), result)
    }

    @Test
    fun plusOne_returnsCorrectResult_case3() {
        val solution = Solution66()
        val digits = intArrayOf(9)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(1, 0), result)
    }

    @Test
    fun plusOne_returnsCorrectResult_case4() {
        val solution = Solution66()
        val digits = intArrayOf(9, 9)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(1, 0, 0), result)
    }

    @Test
    fun plusOne_returnsCorrectResult_forEmptyArray() {
        val solution = Solution66()
        val digits = intArrayOf()
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(1), result)
    }
}