package com.jeglikowski.easy.e0101

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

internal class Solution101 {
    val leftSide = mutableListOf<Int?>()
    val rightSide = mutableListOf<Int?>()

    fun isSymmetric(root: TreeNode?): Boolean {
        leftSideOfTree(root?.left)
        rightSideOfTree(root?.right)

        if (leftSide.size != rightSide.size) {
            return false
        }

        for (i in 0..leftSide.size - 1) {
            if (leftSide[i] != rightSide[i]) {
                return false
            }
        }

        return true
    }

    private fun leftSideOfTree(root: TreeNode?): List<Int?> {
        if (root != null) {
            leftSide.add(root.`val`)
            if (root.right != null || root.left != null) {
                leftSideOfTree(root.left)
                leftSideOfTree(root.right)
            }
        } else {
            leftSide.add(null)
        }

        return leftSide
    }

    private fun rightSideOfTree(root: TreeNode?): List<Int?> {
        if (root != null) {
            rightSide.add(root.`val`)

            if (root.right != null || root.left != null) {
                rightSideOfTree(root.right)
                rightSideOfTree(root.left)
            }
        } else {
            rightSide.add(null)
        }

        return rightSide
    }
}