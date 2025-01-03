package com.jeglikowski.easy.e0001

private class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val substract = target - nums[i]

            if (map.containsKey(substract)) {
                return intArrayOf(i, map[substract]!!)
            } else {
                map[nums[i]] = i
            }
        }
        return IntArray(2)
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = solution.twoSum(nums, target)
    println(result.joinToString())

    val nums2 = intArrayOf(3, 2, 4)
    val target2 = 6
    val result2 = solution.twoSum(nums2, target2)
    println(result2.joinToString())
}