package com.jeglikowski.easy.e0014

internal class Solution14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        var minLength = strs.minBy { it.length }.length
        var samePart = strs[0].substring(0, minLength)
        for (text in strs) {
            val common = findCommonOfTwoStrings(samePart, text)
            samePart = common
            minLength = samePart.length

            if (minLength == 0) {
                return ""
            }
        }
        return samePart
    }

    fun findCommonOfTwoStrings(
        currentCommon: String,
        compareWith: String,
    ): String {
        var lowestPossible = 1
        var highestPossible = currentCommon.length

        if (currentCommon.compareTo(compareWith.substring(0, currentCommon.length)) == 0) {
            return currentCommon
        }

        if (currentCommon.substring(0, 1).compareTo(compareWith.substring(0, 1)) != 0) {
            return ""
        }

        while (lowestPossible != highestPossible) {
            val firstToCompare = currentCommon.substring(0, highestPossible)
            val secondToCompare = compareWith.substring(0, highestPossible)
            if (firstToCompare.compareTo(secondToCompare) == 0) {
                lowestPossible = getNewIndexRoundedHalfUp(lowestPossible, highestPossible)
            } else {
                val newHighest = getNewIndexRoundedHalfUp(lowestPossible, highestPossible)
                highestPossible = if (newHighest == highestPossible) {
                    highestPossible -1
                } else {
                    newHighest
                }
            }
        }
        return currentCommon.substring(0, lowestPossible)
    }

    fun getNewIndexRoundedHalfUp(first: Int, second: Int) : Int {
        val sum = first + second

        return if (sum.rem(2) == 0 ) {
            sum/2
        } else {
            sum/2 +1
        }
    }
}