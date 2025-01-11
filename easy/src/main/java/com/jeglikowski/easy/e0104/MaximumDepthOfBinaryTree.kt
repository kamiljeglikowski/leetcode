package com.jeglikowski.easy.e0104

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

internal class Solution104 {
    var maxDepth = 0
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return maxDepth
        } else {
            val result = depthWithValue(root, 1)

            if (result > maxDepth) maxDepth = result
        }

        return maxDepth
    }

    private fun depthWithValue(root: TreeNode?, currentDepth: Int) : Int{
        if (root?.left != null) {
            val result = depthWithValue(root.left, currentDepth + 1)

            if (result > maxDepth) maxDepth = result
        }
        if (root?.right != null) {
            val result = depthWithValue(root.right, currentDepth +1)

            if (result > maxDepth) maxDepth = result
        }

        if (root == null) {
            if (currentDepth > maxDepth) {
                maxDepth = currentDepth
            }
        }

        return currentDepth
    }
}