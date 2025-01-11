package com.jeglikowski.easy.e0014

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution14Test {

    @Test
    fun longestCommonPrefix_returnsCorrectPrefix_forCommonPrefix() {
        val solution = Solution14()
        val strs = arrayOf("flower", "flow", "flight")
        val result = solution.longestCommonPrefix(strs)
        assertEquals("fl", result)
    }

    @Test
    fun longestCommonPrefix_returnsEmptyString_forNoCommonPrefix() {
        val solution = Solution14()
        val strs = arrayOf("dog", "racecar", "car")
        val result = solution.longestCommonPrefix(strs)
        assertEquals("", result)
    }

    @Test
    fun longestCommonPrefix_returnsSingleCharacter_forSingleCharacterCommonPrefix() {
        val solution = Solution14()
        val strs = arrayOf("ab", "a")
        val result = solution.longestCommonPrefix(strs)
        assertEquals("a", result)
    }

    @Test
    fun longestCommonPrefix_returnsEmptyString_forEmptyArray() {
        val solution = Solution14()
        val strs = arrayOf<String>()
        val result = solution.longestCommonPrefix(strs)
        assertEquals("", result)
    }

    @Test
    fun longestCommonPrefix_returnsFullString_forSingleStringArray() {
        val solution = Solution14()
        val strs = arrayOf("single")
        val result = solution.longestCommonPrefix(strs)
        assertEquals("single", result)
    }

    @Test
    fun longestCommonPrefix_returnsEmptyString_forArrayWithEmptyString() {
        val solution = Solution14()
        val strs = arrayOf("flower", "flow", "")
        val result = solution.longestCommonPrefix(strs)
        assertEquals("", result)
    }
}