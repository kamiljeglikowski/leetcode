package com.jeglikowski.easy.e0020

private class Solution {
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

fun main() {
    val solution = Solution()
    val s = "()"
    val result = solution.isValid(s)
    println(result) // true

    val s2 = "()[]{}"
    val result2 = solution.isValid(s2)
    println(result2) // true

    val s3 = "(]"
    val result3 = solution.isValid(s3)
    println(result3) // false

    val s4 = "([)]"
    val result4 = solution.isValid(s4)
    println(result4) // false

    val s5 = "{[]}"
    val result5 = solution.isValid(s5)
    println(result5) // true
}