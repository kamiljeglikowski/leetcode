package com.jeglikowski.easy.e0088

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class Solution88Test {

    @Test
    fun merge_returnsCorrectResult_case1() {
        val solution = Solution88()
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(2, 5, 6)
        val n = 3
        solution.merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)
    }

    @Test
    fun merge_returnsCorrectResult_case2() {
        val solution = Solution88()
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0
        solution.merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1), nums1)
    }

    @Test
    fun merge_returnsCorrectResult_case3() {
        val solution = Solution88()
        val nums1 = intArrayOf(0)
        val m = 0
        val nums2 = intArrayOf(1)
        val n = 1
        solution.merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1), nums1)
    }

    @Test
    fun merge_returnsCorrectResult_case4() {
        val solution = Solution88()
        val nums1 = intArrayOf(4, 5, 6, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(1, 2, 3)
        val n = 3
        solution.merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6), nums1)
    }

    @Test
    fun merge_returnsCorrectResult_case5() {
        val solution = Solution88()
        val nums1 = intArrayOf(2, 0)
        val m = 1
        val nums2 = intArrayOf(1)
        val n = 1
        solution.merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2), nums1)
    }
}