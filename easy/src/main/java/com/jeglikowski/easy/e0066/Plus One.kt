package com.jeglikowski.easy.e0066

private class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var added: Int
        var indexConsidered = digits.size - 1
        do {
            added = digits[indexConsidered] + 1
            digits[indexConsidered] = added % 10
            if (added == 10 && indexConsidered == 0) {
                return IntArray(0).plus(1).plus(digits)
            }
            indexConsidered--
        } while (added == 10)

        return digits
    }
}

fun main() {
    val solution = Solution()
    val digits = intArrayOf(1, 2, 3)
    val result = solution.plusOne(digits)
    println(result.toList()) // [1, 2, 4]

    val digits2 = intArrayOf(4, 3, 2, 1)
    val result2 = solution.plusOne(digits2)
    println(result2.toList()) // [4, 3, 2, 2]

    val digits3 = intArrayOf(9)
    val result3 = solution.plusOne(digits3)
    println(result3.toList()) // [1, 0]

    val digits4 = intArrayOf(9, 9)
    val result4 = solution.plusOne(digits4)
    println(result4.toList()) // [1, 0, 0]
}