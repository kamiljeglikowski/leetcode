package com.jeglikowski.easy.e0009

private class Solution {
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

fun main() {
    val solution = Solution()
    val x = 121
    val result = solution.isPalindrome(x)
    println(result)

    val x2 = -121
    val result2 = solution.isPalindrome(x2)
    println(result2)

    val x3 = 10
    val result3 = solution.isPalindrome(x3)
    println(result3)
}