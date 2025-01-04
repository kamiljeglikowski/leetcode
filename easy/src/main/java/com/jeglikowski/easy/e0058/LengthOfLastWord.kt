package com.jeglikowski.easy.e0058

private class Solution {
    fun lengthOfLastWord(s: String): Int {
        var index = s.length - 1

        var size = 0
        while (s[index] == ' ') {
            index--
        }

        while (index >= 0 && s[index] != ' ') {
            index--
            size++
        }

        return size
    }
}

fun main() {
    val solution = Solution()
    val s = "Hello World"
    val result = solution.lengthOfLastWord(s)
    println(result) // 5

    val s2 = "   fly me   to   the moon  "
    val result2 = solution.lengthOfLastWord(s2)
    println(result2) // 4

    val s3 = "luffy is still joyboy"
    val result3 = solution.lengthOfLastWord(s3)
    println(result3) // 6
}