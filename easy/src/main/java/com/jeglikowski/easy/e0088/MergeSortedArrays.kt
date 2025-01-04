package com.jeglikowski.easy.e0088

private class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val newList = IntArray(m + n)
        var firstListIndex = 0
        var secondListIndex = 0
        for (i in 0..m + n -1) {
            var firstVal = if (firstListIndex < m) nums1[firstListIndex] else null
            var secondVal = if (secondListIndex < n) nums2[secondListIndex] else null
            if (firstVal == null) {
                newList[i] = secondVal!!
                secondListIndex++
            } else if (secondVal == null) {
                newList[i] = firstVal!!
                firstListIndex++
            } else {
                if (firstVal < secondVal) {
                    newList[i] = firstVal
                    firstListIndex++
                } else {
                    newList[i] = secondVal
                    secondListIndex++
                }
            }
        }
        newList.copyInto(nums1)
    }
}

fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3
    val nums2 = intArrayOf(2, 5, 6)
    val n = 3
    solution.merge(nums1, m, nums2, n)
    println(nums1.toList()) // [1, 2, 2, 3, 5, 6]

    val nums3 = intArrayOf(1)
    val m2 = 1
    val nums4 = intArrayOf()
    val n2 = 0
    solution.merge(nums3, m2, nums4, n2)
    println(nums3.toList()) // [1]

    val nums5 = intArrayOf(0)
    val m3 = 0
    val nums6 = intArrayOf(1)
    val n3 = 1
    solution.merge(nums5, m3, nums6, n3)
    println(nums5.toList()) // [1]
}