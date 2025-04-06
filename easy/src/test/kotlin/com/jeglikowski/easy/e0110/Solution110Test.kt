package com.jeglikowski.easy.e0110

import org.junit.Test
import org.junit.Assert.*

class Solution110Test {

 @Test
 fun isBalanced_returnsTrue_forBalancedTree() {
  val solution = Solution110()
  val root = TreeNode(1)
  root.left = TreeNode(2)
  root.right = TreeNode(3)
  root.left?.left = TreeNode(4)
  root.left?.right = TreeNode(5)
  root.right?.left = TreeNode(6)
  root.right?.right = TreeNode(7)

  val result = solution.isBalanced(root)
  assertTrue(result)
 }

 @Test
 fun isBalanced_returnsFalse_forUnbalancedTree() {
  val solution = Solution110()
  val root = TreeNode(1)
  root.left = TreeNode(2)
  root.left?.left = TreeNode(3)
  root.left?.left?.left = TreeNode(4)
  root.left?.left?.left?.left = TreeNode(5)
  root.left?.left?.left?.left?.left = TreeNode(6)
  root.left?.left?.left?.left?.left?.left = TreeNode(7)

  val result = solution.isBalanced(root)
  assertFalse(result)
 }

 @Test
 fun isBalanced_returnsTrue_forEmptyTree() {
  val solution = Solution110()
  val result = solution.isBalanced(null)
  assertTrue(result)
 }

 @Test
 fun isBalanced_returnsTrue_forSingleElementTree() {
  val solution = Solution110()
  val root = TreeNode(1)

  val result = solution.isBalanced(root)
  assertTrue(result)
 }
}