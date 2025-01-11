package com.jeglikowski.easy.e0067

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution67Test {

    @Test
    fun addBinary_returnsCorrectResult_case1() {
        val solution = Solution67()
        val a = "11"
        val b = "1"
        val result = solution.addBinary(a, b)
        assertEquals("100", result)
    }

    @Test
    fun addBinary_returnsCorrectResult_case2() {
        val solution = Solution67()
        val a = "1010"
        val b = "1011"
        val result = solution.addBinary(a, b)
        assertEquals("10101", result)
    }

    @Test
    fun addBinary_returnsCorrectResult_case3() {
        val solution = Solution67()
        val a = "0"
        val b = "0"
        val result = solution.addBinary(a, b)
        assertEquals("0", result)
    }

    @Test
    fun addBinary_returnsCorrectResult_case4() {
        val solution = Solution67()
        val a = "1111"
        val b = "1111"
        val result = solution.addBinary(a, b)
        assertEquals("11110", result)
    }

    @Test
    fun addBinary_returnsCorrectResult_forEmptyStrings() {
        val solution = Solution67()
        val a = ""
        val b = ""
        val result = solution.addBinary(a, b)
        assertEquals("0", result)
    }
}