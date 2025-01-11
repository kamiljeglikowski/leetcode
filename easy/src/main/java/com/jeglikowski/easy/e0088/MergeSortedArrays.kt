package com.jeglikowski.easy.e0088

internal class Solution88 {
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