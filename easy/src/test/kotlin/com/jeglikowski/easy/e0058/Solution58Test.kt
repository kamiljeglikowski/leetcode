package com.jeglikowski.easy.e0058

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution58Test {

    @Test
    fun lengthOfLastWord_returnsCorrectLength_case1() {
        val solution = Solution58()
        val s = "Hello World"
        val result = solution.lengthOfLastWord(s)
        assertEquals(5, result)
    }

    @Test
    fun lengthOfLastWord_returnsCorrectLength_case2() {
        val solution = Solution58()
        val s = "   fly me   to   the moon  "
        val result = solution.lengthOfLastWord(s)
        assertEquals(4, result)
    }

    @Test
    fun lengthOfLastWord_returnsCorrectLength_case3() {
        val solution = Solution58()
        val s = "luffy is still joyboy"
        val result = solution.lengthOfLastWord(s)
        assertEquals(6, result)
    }

    @Test
    fun lengthOfLastWord_returnsZero_forEmptyString() {
        val solution = Solution58()
        val s = ""
        val result = solution.lengthOfLastWord(s)
        assertEquals(0, result)
    }

    @Test
    fun lengthOfLastWord_returnsCorrectLength_forStringWithOnlySpaces() {
        val solution = Solution58()
        val s = "     "
        val result = solution.lengthOfLastWord(s)
        assertEquals(0, result)
    }
}