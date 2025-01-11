package com.jeglikowski.easy.e0094

import org.junit.Assert.assertEquals
import org.junit.Test

class Solution94Test {

    @Test
    fun inorderTraversal_returnsCorrectResult_case1() {
        val solution = Solution94()
        val root = TreeNode2(1)
        root.right = TreeNode2(2)
        root.right?.left = TreeNode2(3)
        val result = solution.inorderTraversal(root)
        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun inorderTraversal_returnsCorrectResult_case2() {
        val solution = Solution94()
        val root = TreeNode2(1)
        root.left = TreeNode2(2)
        root.right = TreeNode2(3)
        root.left?.left = TreeNode2(4)
        root.left?.right = TreeNode2(5)
        val result = solution.inorderTraversal(root)
        assertEquals(listOf(4, 2, 5, 1, 3), result)
    }

    @Test
    fun inorderTraversal_returnsCorrectResult_case3() {
        val solution = Solution94()
        val root = TreeNode2(1)
        val result = solution.inorderTraversal(root)
        assertEquals(listOf(1), result)
    }

    @Test
    fun inorderTraversal_returnsCorrectResult_case4() {
        val solution = Solution94()
        val root = TreeNode2(1)
        root.left = TreeNode2(2)
        val result = solution.inorderTraversal(root)
        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun inorderTraversal_returnsCorrectResult_case5() {
        val solution = Solution94()
        val root = TreeNode2(1)
        root.right = TreeNode2(2)
        val result = solution.inorderTraversal(root)
        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun inorderTraversal_returnsCorrectResult_forEmptyTree() {
        val solution = Solution94()
        val result = solution.inorderTraversal(null)
        assertEquals(emptyList<Int>(), result)
    }
}