package com.jeglikowski.easy.e0069

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution69Test {

    @Test
    fun mySqrt_returnsCorrectResult_case1() {
        val solution = Solution69()
        val x = 4
        val result = solution.mySqrt(x)
        assertEquals(2, result)
    }

    @Test
    fun mySqrt_returnsCorrectResult_case2() {
        val solution = Solution69()
        val x = 8
        val result = solution.mySqrt(x)
        assertEquals(2, result)
    }

    @Test
    fun mySqrt_returnsCorrectResult_case3() {
        val solution = Solution69()
        val x = 9
        val result = solution.mySqrt(x)
        assertEquals(3, result)
    }

    @Test
    fun mySqrt_returnsCorrectResult_case4() {
        val solution = Solution69()
        val x = 16
        val result = solution.mySqrt(x)
        assertEquals(4, result)
    }

    @Test
    fun mySqrt_returnsCorrectResult_case5() {
        val solution = Solution69()
        val x = 2147395599
        val result = solution.mySqrt(x)
        assertEquals(46339, result)
    }
}