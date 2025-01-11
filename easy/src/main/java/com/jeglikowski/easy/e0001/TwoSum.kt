package com.jeglikowski.easy.e0001

internal class Solution1 {
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