package com.jeglikowski.easy.e0066

internal class Solution66 {
    fun plusOne(digits: IntArray): IntArray {
        var added: Int

        if (digits.isEmpty()) {
            return IntArray(0).plus(1)
        }
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