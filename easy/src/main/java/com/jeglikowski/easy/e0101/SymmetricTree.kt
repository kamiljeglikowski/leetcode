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

private class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

private class Solution {

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

    fun leftSideOfTree(root: TreeNode?): List<Int?> {
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

    fun rightSideOfTree(root: TreeNode?): List<Int?> {
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

fun main() {
    val solution = Solution()
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(2)
    root.left?.left = TreeNode(3)
    root.left?.right = TreeNode(4)
    root.right?.left = TreeNode(4)
    root.right?.right = TreeNode(3)
    val result = solution.isSymmetric(root)
    println(result) // true

    solution.leftSide.clear()
    solution.rightSide.clear()
    val root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(2)
    root2.left?.right = TreeNode(3)
    root2.right?.right = TreeNode(3)
    val result2 = solution.isSymmetric(root2)
    println(result2) // false

    solution.leftSide.clear()
    solution.rightSide.clear()
    val root3 = TreeNode(1)
    root3.left = TreeNode(2)
    root3.right = TreeNode(2)
    root3.left?.left = TreeNode(2)
    root3.left?.right = null
    root3.right?.left = TreeNode(2)
    root3.right?.right = null
    val result3 = solution.isSymmetric(root3)
    println(result3) // false

}