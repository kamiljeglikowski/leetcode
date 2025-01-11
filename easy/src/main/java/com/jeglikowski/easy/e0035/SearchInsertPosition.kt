package com.jeglikowski.easy.e0035

internal class Solution35 {
    fun searchInsert(
        nums: IntArray,
        target: Int,
    ): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var minIndex = 0
        var maxIndex = nums.size - 1
        var middleIndex: Int
        if (target < nums[minIndex]) {
            return 0
        }
        if (target > nums[maxIndex]) {
            return maxIndex + 1
        }
        while (minIndex != maxIndex) {
            middleIndex = (minIndex + maxIndex) / 2

            if (minIndex + 1 == maxIndex) {
                if (target > nums[minIndex]) {
                    return maxIndex
                } else {
                    return minIndex
                }
            }

            if (target < nums[middleIndex]) {
                maxIndex = middleIndex
            } else {
                minIndex = middleIndex
            }
        }
        return minIndex
    }
}