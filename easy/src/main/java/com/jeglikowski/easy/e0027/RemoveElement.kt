package com.jeglikowski.easy.e0027

internal class Solution27 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        for (value in nums){
            if (value != `val`) {
                nums[index] = value
                index++
            }
        }

        return index
    }
}