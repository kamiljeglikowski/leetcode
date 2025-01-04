package com.jeglikowski.easy.e0069

private class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 0) return 0
        val powers = mutableListOf(1)
        for (i in 1..31) {
            powers.add(i, powers[i - 1] * 2)
        }

        var biggestPowerBelowX: Long = 0

        do {
            for (i in 0..31) {
                val result: Long = (biggestPowerBelowX + powers[i]) * (biggestPowerBelowX + powers[i])
                if (result > x) {
                    biggestPowerBelowX += powers[i - 1]
                    break
                }
            }
        } while ((biggestPowerBelowX + 1) * (biggestPowerBelowX + 1) <= x)

        return biggestPowerBelowX.toInt()
    }
}

fun main() {
    val solution = Solution()
    val x = 4
    val result = solution.mySqrt(x)
    println(result) // 2

    val x2 = 8
    val result2 = solution.mySqrt(x2)
    println(result2) // 2

    val x3 = 9
    val result3 = solution.mySqrt(x3)
    println(result3) // 3

    val x4 = 16
    val result4 = solution.mySqrt(x4)
    println(result4) // 4

    val x5 = 2147395599
    val result5 = solution.mySqrt(x5)
    println(result5) // 46339
}