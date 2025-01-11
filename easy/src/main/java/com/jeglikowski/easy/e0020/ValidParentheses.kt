package com.jeglikowski.easy.e0020

internal class Solution20 {
    fun isValid(s: String): Boolean {
        var stack = ArrayDeque<Char>()
        for (letter in s.toList()) {
            when (letter) {
                '{', '(', '[' -> {
                    stack.addLast(letter)
                }

                ')' -> if (!checkIsCorrectParentheses(stack.removeLastOrNull(), '(')) {
                    return false
                }

                ']' -> if (!checkIsCorrectParentheses(stack.removeLastOrNull(), '[')) {
                    return false
                }

                '}' -> if (!checkIsCorrectParentheses(stack.removeLastOrNull(), '{')) {
                    return false
                }
            }
        }
        return stack.size == 0
    }

    fun checkIsCorrectParentheses(stackElement: Char?, neededChar: Char): Boolean {
        return stackElement == neededChar
    }
}