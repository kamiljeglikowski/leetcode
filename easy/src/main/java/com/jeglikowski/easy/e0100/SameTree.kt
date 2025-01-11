package com.jeglikowski.easy.e0100

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

internal class Solution100 {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q != null) {
            return false
        } else if (p != null && q == null) {
            return false
        } else if (p == null && q == null ) {
            return true
        } else {
            if  (p?.`val` == q?.`val`) {
                val leftCorrect = isSameTree(p?.left, q?.left)
                if (!leftCorrect) return false

                val rightCorrect = isSameTree(p?.right, q?.right)
                if (!rightCorrect) return false
            } else {
                return false
            }
        }

        return true
    }
}