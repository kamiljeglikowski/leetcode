package com.jeglikowski.easy.e0001

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class Solution1Test {

    @Test
    fun twoSum_returnsCorrectIndices_case1() {
        val solution1 = Solution1()
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = solution1.twoSum(nums, target)
        assertArrayEquals(intArrayOf(1, 0), result)
    }

    @Test
    fun twoSum_returnsCorrectIndices_case2() {
        val solution1 = Solution1()
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val result = solution1.twoSum(nums, target)
        assertArrayEquals(intArrayOf(2, 1), result)
    }

    @Test
    fun twoSum_returnsEmptyArray_whenNoSolution() {
        val solution1 = Solution1()
        val nums = intArrayOf(1, 2, 3)
        val target = 7
        val result = solution1.twoSum(nums, target)
        assertArrayEquals(IntArray(2), result)
    }

    @Test
    fun twoSum_returnsCorrectIndices_withNegativeNumbers() {
        val solution1 = Solution1()
        val nums = intArrayOf(-1, -2, -3, -4, -5)
        val target = -8
        val result = solution1.twoSum(nums, target)
        assertArrayEquals(intArrayOf(4, 2), result)
    }

    @Test
    fun twoSum_returnsCorrectIndices_withZeroes() {
        val solution1 = Solution1()
        val nums = intArrayOf(0, 4, 3, 0)
        val target = 0
        val result = solution1.twoSum(nums, target)
        assertArrayEquals(intArrayOf(3, 0), result)
    }
}