package com.jeglikowski.easy.e0058

internal class Solution58 {
    fun lengthOfLastWord(s: String): Int {
        var index = s.length - 1

        var size = 0
        while (index >= 0 && s[index] == ' ') {
            index--
        }

        while (index >= 0 && s[index] != ' ') {
            index--
            size++
        }

        return size
    }
}