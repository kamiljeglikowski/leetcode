package com.jeglikowski.easy.e0013

internal class Solution13 {
    fun romanToInt(s: String): Int {
        var result = 0
        var prevValue = 0
        for (i in s.length - 1 downTo 0) {
            val value = formatCharToValue(s[i])
            if (value < prevValue) {
                result -= value
            } else {
                result += value
            }
            prevValue = value
        }
        return result
    }

    fun formatCharToValue(char: Char): Int {
        when (char) {
            'I' -> return 1
            'V' -> return 5
            'X' -> return 10
            'L' -> return 50
            'C' -> return 100
            'D' -> return 500
            'M' -> return 1000
        }
        return 1
    }
}