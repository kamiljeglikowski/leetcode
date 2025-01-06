package com.jeglikowski.easy.e0094

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

// Recursive 1

private class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()

        return inorderTraversal(root.left) + root.`val` + inorderTraversal(root.right)
    }
}

fun main() {
    val solution = Solution()
    val root = TreeNode(1)
    root.right = TreeNode(2)
    root.right?.left = TreeNode(3)
    val result = solution.inorderTraversal(root)
    println(result) // [1, 3, 2]
}