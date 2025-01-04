package com.jeglikowski.easy.e0028

private class Solution {
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }
}

fun main() {
    val solution = Solution()
    val haystack = "hello"
    val needle = "ll"
    val result = solution.strStr(haystack, needle)
    println(result) // 2

    val haystack2 = "aaaaa"
    val needle2 = "bba"
    val result2 = solution.strStr(haystack2, needle2)
    println(result2) // -1

    val haystack3 = ""
    val needle3 = ""
    val result3 = solution.strStr(haystack3, needle3)
    println(result3) // 0
}