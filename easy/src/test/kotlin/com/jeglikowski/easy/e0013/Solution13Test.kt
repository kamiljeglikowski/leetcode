package com.jeglikowski.easy.e0013

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution13Test {

    @Test
    fun romanToInt_returnsCorrectValue_forSimpleNumerals() {
        val solution = Solution13()
        assertEquals(3, solution.romanToInt("III"))
        assertEquals(4, solution.romanToInt("IV"))
        assertEquals(9, solution.romanToInt("IX"))
    }

    @Test
    fun romanToInt_returnsCorrectValue_forComplexNumerals() {
        val solution = Solution13()
        assertEquals(58, solution.romanToInt("LVIII"))
        assertEquals(1994, solution.romanToInt("MCMXCIV"))
    }

    @Test
    fun romanToInt_returnsZero_forEmptyString() {
        val solution = Solution13()
        assertEquals(0, solution.romanToInt(""))
    }

    @Test
    fun romanToInt_returnsCorrectValue_forSingleCharacter() {
        val solution = Solution13()
        assertEquals(1, solution.romanToInt("I"))
        assertEquals(5, solution.romanToInt("V"))
        assertEquals(10, solution.romanToInt("X"))
        assertEquals(50, solution.romanToInt("L"))
        assertEquals(100, solution.romanToInt("C"))
        assertEquals(500, solution.romanToInt("D"))
        assertEquals(1000, solution.romanToInt("M"))
    }

    @Test
    fun romanToInt_returnsCorrectValue_forInvalidCharacters() {
        val solution = Solution13()
        assertEquals(1, solution.romanToInt("A"))
        assertEquals(1, solution.romanToInt("B"))
    }
}