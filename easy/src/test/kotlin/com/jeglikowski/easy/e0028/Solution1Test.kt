package com.jeglikowski.easy.e0028

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution1Test {

    @Test
    fun strStr_returnsCorrectIndex_case1() {
        val solution = Solution()
        val haystack = "hello"
        val needle = "ll"
        val result = solution.strStr(haystack, needle)
        assertEquals(2, result)
    }

    @Test
    fun strStr_returnsCorrectIndex_case2() {
        val solution = Solution()
        val haystack = "aaaaa"
        val needle = "bba"
        val result = solution.strStr(haystack, needle)
        assertEquals(-1, result)
    }

    @Test
    fun strStr_returnsZero_forEmptyNeedle() {
        val solution = Solution()
        val haystack = "hello"
        val needle = ""
        val result = solution.strStr(haystack, needle)
        assertEquals(0, result)
    }

    @Test
    fun strStr_returnsZero_forBothEmptyStrings() {
        val solution = Solution()
        val haystack = ""
        val needle = ""
        val result = solution.strStr(haystack, needle)
        assertEquals(0, result)
    }

    @Test
    fun strStr_returnsCorrectIndex_forNeedleAtStart() {
        val solution = Solution()
        val haystack = "hello"
        val needle = "he"
        val result = solution.strStr(haystack, needle)
        assertEquals(0, result)
    }

    @Test
    fun strStr_returnsCorrectIndex_forNeedleAtEnd() {
        val solution = Solution()
        val haystack = "hello"
        val needle = "lo"
        val result = solution.strStr(haystack, needle)
        assertEquals(3, result)
    }
}