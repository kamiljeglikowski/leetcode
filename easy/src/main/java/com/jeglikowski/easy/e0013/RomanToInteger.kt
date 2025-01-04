package com.jeglikowski.easy.e0013

class Solution {
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

fun main() {
    val solution = Solution()
    val s = "III"
    val result = solution.romanToInt(s)
    println(result) // 3

    val s2 = "IV"
    val result2 = solution.romanToInt(s2)
    println(result2) // 4

    val s3 = "IX"
    val result3 = solution.romanToInt(s3)
    println(result3) // 9

    val s4 = "LVIII"
    val result4 = solution.romanToInt(s4)
    println(result4) // 58

    val s5 = "MCMXCIV"
    val result5 = solution.romanToInt(s5)
    println(result5) // 1994
}