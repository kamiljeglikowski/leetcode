package com.jeglikowski.easy.e0110

import kotlin.math.abs

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

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution110 {
    fun isBalanced(root: TreeNode?): Boolean {
        try {
            getLevel(root, 0)
        } catch (e: Exception) {
            return false
        }
        return true
    }

    private fun getLevel(root: TreeNode?, currentLevel: Int): Int {
        if (root == null) {
            return currentLevel
        }

        val leftLevel = getLevel(root.left, currentLevel + 1)
        val rightLevel = getLevel(root.right, currentLevel + 1)

        if (abs(leftLevel - rightLevel) > 1) {
            throw Exception()
        }

        return leftLevel.coerceAtLeast(rightLevel)
    }
}