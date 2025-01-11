package com.jeglikowski.easy.e0069

internal class Solution69 {
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