package com.jeglikowski.easy.e0108

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

internal class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

internal class Solution108 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        val itemsAmount = nums.size
        val middleIndex: Int = if (itemsAmount % 2 == 0) {
            itemsAmount / 2 - 1
        } else {
            itemsAmount / 2
        }

        val resultHead = TreeNode(nums[middleIndex])
        val leftArray = if (middleIndex > 0) {
            nums.copyOfRange(0, middleIndex)
        } else {
            null
        }

        if (leftArray != null) {
            resultHead.left = sortedArrayToBST(leftArray)
        }

        val rightArray = if (middleIndex < nums.lastIndex) {
            nums.copyOfRange(middleIndex + 1, nums.size)
        } else {
            null
        }

        if (rightArray != null) {
            resultHead.right = sortedArrayToBST(rightArray)
        }

        return resultHead
    }
}