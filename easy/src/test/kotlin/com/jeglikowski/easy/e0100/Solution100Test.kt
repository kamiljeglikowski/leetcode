package com.jeglikowski.easy.e0100

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class Solution100Test {

    @Test
    fun isSameTree_returnsTrue_forIdenticalTrees() {
        val solution = Solution100()
        val p = TreeNode(1)
        p.left = TreeNode(2)
        p.right = TreeNode(3)
        val q = TreeNode(1)
        q.left = TreeNode(2)
        q.right = TreeNode(3)
        val result = solution.isSameTree(p, q)
        assertTrue(result)
    }

    @Test
    fun isSameTree_returnsFalse_forDifferentStructure() {
        val solution = Solution100()
        val p = TreeNode(1)
        p.left = TreeNode(2)
        val q = TreeNode(1)
        q.right = TreeNode(2)
        val result = solution.isSameTree(p, q)
        assertFalse(result)
    }

    @Test
    fun isSameTree_returnsFalse_forDifferentValues() {
        val solution = Solution100()
        val p = TreeNode(1)
        p.left = TreeNode(2)
        p.right = TreeNode(1)
        val q = TreeNode(1)
        q.left = TreeNode(1)
        q.right = TreeNode(2)
        val result = solution.isSameTree(p, q)
        assertFalse(result)
    }

    @Test
    fun isSameTree_returnsTrue_forBothNull() {
        val solution = Solution100()
        val result = solution.isSameTree(null, null)
        assertTrue(result)
    }

    @Test
    fun isSameTree_returnsFalse_forOneNull() {
        val solution = Solution100()
        val p = TreeNode(1)
        val result = solution.isSameTree(p, null)
        assertFalse(result)
    }
}