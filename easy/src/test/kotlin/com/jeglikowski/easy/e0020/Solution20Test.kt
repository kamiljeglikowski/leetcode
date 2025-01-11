package com.jeglikowski.easy.e0020

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class Solution20Test {

    @Test
    fun isValid_returnsTrue_forValidParentheses() {
        val solution = Solution20()
        assertTrue(solution.isValid("()"))
        assertTrue(solution.isValid("()[]{}"))
        assertTrue(solution.isValid("{[]}"))
    }

    @Test
    fun isValid_returnsFalse_forInvalidParentheses() {
        val solution = Solution20()
        assertFalse(solution.isValid("(]"))
        assertFalse(solution.isValid("([)]"))
        assertFalse(solution.isValid("{[}"))
    }

    @Test
    fun isValid_returnsTrue_forEmptyString() {
        val solution = Solution20()
        assertTrue(solution.isValid(""))
    }

    @Test
    fun isValid_returnsFalse_forSingleOpeningParenthesis() {
        val solution = Solution20()
        assertFalse(solution.isValid("("))
        assertFalse(solution.isValid("["))
        assertFalse(solution.isValid("{"))
    }

    @Test
    fun isValid_returnsFalse_forSingleClosingParenthesis() {
        val solution = Solution20()
        assertFalse(solution.isValid(")"))
        assertFalse(solution.isValid("]"))
        assertFalse(solution.isValid("}"))
    }
}