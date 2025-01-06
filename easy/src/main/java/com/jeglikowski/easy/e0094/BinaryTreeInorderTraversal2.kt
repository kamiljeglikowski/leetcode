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

private class TreeNode2(var `val`: Int) {
    var left: TreeNode2? = null
    var right: TreeNode2? = null
}
// Recursive 2
private class Solution2 {
    val result = mutableListOf<Int>()
    fun inorderTraversal(root: TreeNode2?): List<Int> {
        if (root != null) {
            inorderTraversal(root.left)
            result.add(root.`val`)
            inorderTraversal(root.right)
        }

        return result
    }
}

fun main() {
    val solution = Solution2()
    val root = TreeNode2(1)
    root.right = TreeNode2(2)
    root.right?.left = TreeNode2(3)
    val result = solution.inorderTraversal(root)
    println(result) // [1, 3, 2]
}