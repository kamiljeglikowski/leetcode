package com.jeglikowski.easy.e0035

private class Solution {
    fun searchInsert(
        nums: IntArray,
        target: Int,
    ): Int {
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

fun main() {
    val solution = Solution()
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 5
    val result = solution.searchInsert(nums, target)
    println(result) // 2

    val nums2 = intArrayOf(1, 3, 5, 6)
    val target2 = 2
    val result2 = solution.searchInsert(nums2, target2)
    println(result2) // 1

    val nums3 = intArrayOf(1, 3, 5, 6)
    val target3 = 7
    val result3 = solution.searchInsert(nums3, target3)
    println(result3) // 4

    val nums4 = intArrayOf(1, 3, 5, 6)
    val target4 = 0
    val result4 = solution.searchInsert(nums4, target4)
    println(result4) // 0
}