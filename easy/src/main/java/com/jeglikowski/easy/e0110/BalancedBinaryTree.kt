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

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        try {
            getLevel(root, 0)
        } catch (e: Exception){
        return false
        }
        return true
    }

    private fun getLevel(root: TreeNode?, currentLevel: Int) : Int {
        if (root == null) {
            return currentLevel
        }

        val leftLevel = getLevel(root.left, currentLevel)
        val rightLevel = getLevel(root.right, currentLevel)

        if (abs(leftLevel-rightLevel) > 1) {
            throw Exception()
        }

        return leftLevel.coerceAtLeast(rightLevel)
    }
}

fun main() {
    val solution = Solution()
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)
    root.right?.left = TreeNode(6)
    root.right?.right = TreeNode(7)

    val result = solution.isBalanced(root)
    println(result) // true

}