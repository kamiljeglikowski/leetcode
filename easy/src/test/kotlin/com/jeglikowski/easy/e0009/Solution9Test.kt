package com.jeglikowski.easy.e0009

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class Solution9Test {

    @Test
    fun isPalindrome_returnsTrue_forPositivePalindrome() {
        val solution = Solution9()
        val result = solution.isPalindrome(121)
        assertTrue(result)
    }

    @Test
    fun isPalindrome_returnsFalse_forNegativeNumber() {
        val solution = Solution9()
        val result = solution.isPalindrome(-121)
        assertFalse(result)
    }

    @Test
    fun isPalindrome_returnsFalse_forNonPalindrome() {
        val solution = Solution9()
        val result = solution.isPalindrome(10)
        assertFalse(result)
    }

    @Test
    fun isPalindrome_returnsTrue_forSingleDigitNumber() {
        val solution = Solution9()
        val result = solution.isPalindrome(7)
        assertTrue(result)
    }

    @Test
    fun isPalindrome_returnsTrue_forZero() {
        val solution = Solution9()
        val result = solution.isPalindrome(0)
        assertTrue(result)
    }
}