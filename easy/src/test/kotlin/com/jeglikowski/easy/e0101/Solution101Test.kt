package com.jeglikowski.easy.e0101

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class Solution101Test {

    @Test
    fun isSymmetric_returnsTrue_forSymmetricTree() {
        val solution = Solution101()
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(2)
        root.left?.left = TreeNode(3)
        root.left?.right = TreeNode(4)
        root.right?.left = TreeNode(4)
        root.right?.right = TreeNode(3)
        val result = solution.isSymmetric(root)
        assertTrue(result)
    }

    @Test
    fun isSymmetric_returnsFalse_forAsymmetricTree() {
        val solution = Solution101()
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(2)
        root.left?.right = TreeNode(3)
        root.right?.right = TreeNode(3)
        val result = solution.isSymmetric(root)
        assertFalse(result)
    }

    @Test
    fun isSymmetric_returnsFalse_forDifferentValues() {
        val solution = Solution101()
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(2)
        root.left?.left = TreeNode(2)
        root.right?.left = TreeNode(3)
        val result = solution.isSymmetric(root)
        assertFalse(result)
    }

    @Test
    fun isSymmetric_returnsTrue_forEmptyTree() {
        val solution = Solution101()
        val result = solution.isSymmetric(null)
        assertTrue(result)
    }

    @Test
    fun isSymmetric_returnsTrue_forSingleElementTree() {
        val solution = Solution101()
        val root = TreeNode(1)
        val result = solution.isSymmetric(root)
        assertTrue(result)
    }
}