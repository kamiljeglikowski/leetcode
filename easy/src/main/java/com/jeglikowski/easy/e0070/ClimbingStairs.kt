package com.jeglikowski.easy.e0070

internal class Solution70 {
    fun climbStairs(n: Int): Int {
        val cache = IntArray(n +1)
        cache[0] = 0
        cache[1] = 1
        if (n>=2) cache[2] = 2

        for (i in 3..n){
            cache[i] = cache[i-1] + cache[i-2]
        }
        return cache[n]
    }
}