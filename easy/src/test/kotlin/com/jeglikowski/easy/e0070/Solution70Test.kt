package com.jeglikowski.easy.e0070

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution70Test {

    @Test
    fun climbStairs_returnsCorrectResult_case1() {
        val solution = Solution70()
        val n = 2
        val result = solution.climbStairs(n)
        assertEquals(2, result)
    }

    @Test
    fun climbStairs_returnsCorrectResult_case2() {
        val solution = Solution70()
        val n = 3
        val result = solution.climbStairs(n)
        assertEquals(3, result)
    }

    @Test
    fun climbStairs_returnsCorrectResult_case3() {
        val solution = Solution70()
        val n = 4
        val result = solution.climbStairs(n)
        assertEquals(5, result)
    }

    @Test
    fun climbStairs_returnsCorrectResult_case4() {
        val solution = Solution70()
        val n = 5
        val result = solution.climbStairs(n)
        assertEquals(8, result)
    }

    @Test
    fun climbStairs_returnsCorrectResult_case5() {
        val solution = Solution70()
        val n = 6
        val result = solution.climbStairs(n)
        assertEquals(13, result)
    }

    @Test
    fun climbStairs_returnsCorrectResult_case6() {
        val solution = Solution70()
        val n = 7
        val result = solution.climbStairs(n)
        assertEquals(21, result)
    }
}