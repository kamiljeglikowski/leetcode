package com.jeglikowski.easy.e0026

internal class Solution26 {
    fun removeDuplicates(nums: IntArray): Int {
        val set = nums.toSet()
        for (i in 0..set.size-1) {
            nums[i] = set.elementAt(i)
        }
        return set.size
    }
}