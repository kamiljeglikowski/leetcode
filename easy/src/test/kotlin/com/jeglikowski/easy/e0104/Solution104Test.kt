package com.jeglikowski.easy.e0104

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution104Test {

    @Test
    fun maxDepth_returnsCorrectResult_case1() {
        val solution = Solution104()
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right?.left = TreeNode(15)
        root.right?.right = TreeNode(7)
        val result = solution.maxDepth(root)
        assertEquals(3, result)
    }

    @Test
    fun maxDepth_returnsCorrectResult_case2() {
        val solution = Solution104()
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.left?.left = TreeNode(3)
        root.left?.left?.left = TreeNode(4)
        val result = solution.maxDepth(root)
        assertEquals(4, result)
    }

    @Test
    fun maxDepth_returnsCorrectResult_case3() {
        val solution = Solution104()
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right?.right = TreeNode(3)
        root.right?.right?.right = TreeNode(4)
        val result = solution.maxDepth(root)
        assertEquals(4, result)
    }

    @Test
    fun maxDepth_returnsCorrectResult_forEmptyTree() {
        val solution = Solution104()
        val result = solution.maxDepth(null)
        assertEquals(0, result)
    }

    @Test
    fun maxDepth_returnsCorrectResult_forSingleElementTree() {
        val solution = Solution104()
        val root = TreeNode(1)
        val result = solution.maxDepth(root)
        assertEquals(1, result)
    }
}