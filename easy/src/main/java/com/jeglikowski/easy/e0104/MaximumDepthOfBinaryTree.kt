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

private class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

private class Solution {
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

    fun depthWithValue(root: TreeNode?, currentDepth: Int) : Int{
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

fun main() {
    val solution = Solution()
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)
    val result = solution.maxDepth(root)
    println(result) // 3

    solution.maxDepth = 0

    val root2 = TreeNode(0)
    root2.left = null
    root2.right = null
    val result2 = solution.maxDepth(root2)
    println(result2) // 1
}