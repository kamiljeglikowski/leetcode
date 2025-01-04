package com.jeglikowski.easy.e0026

private class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = nums.toSet()
        for (i in 0..set.size-1) {
            nums[i] = set.elementAt(i)
        }
        return set.size
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(1, 1, 2)
    val result = solution.removeDuplicates(nums)
    println(result) // 2

    val nums2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result2 = solution.removeDuplicates(nums2)
    println(result2) // 5
}