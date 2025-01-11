package com.jeglikowski.easy.e0009

internal class Solution9 {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var reversed = 0
        var value = x
        while (value != 0) {
            reversed = reversed * 10 + value % 10
            value = value / 10
        }
        return reversed == x
    }
}