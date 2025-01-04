package com.jeglikowski.easy.e0021

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

private class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

private class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }
        var result : ListNode? = null
        var resultLast : ListNode? = null
        var currentList1Item: ListNode?= list1
        var currentList2Item : ListNode?= list2
        do {
            var list1Item = currentList1Item?.`val` ?: 1000000
            var list2Item = currentList2Item?.`val` ?: 1000000

            if (list1Item < list2Item) {
                if (result == null) {
                    result = ListNode(list1Item)
                    resultLast = result
                } else {
                    resultLast?.next = ListNode(list1Item)
                    resultLast = resultLast!!.next
                }
                currentList1Item = currentList1Item?.next
            } else {
                if (result == null) {
                    result = ListNode(list2Item)
                    resultLast = result
                } else {
                    resultLast?.next = ListNode(list2Item)
                    resultLast = resultLast!!.next
                }
                currentList2Item = currentList2Item?.next
            }

        } while (currentList1Item != null || currentList2Item != null)

        return result
    }
}

fun main() {
    val solution = Solution()
    val l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next?.next = ListNode(4)

    val l2 = ListNode(1)
    l2.next = ListNode(3)
    l2.next?.next = ListNode(4)

    val result = solution.mergeTwoLists(l1, l2)
    var current = result
    while (current != null) {
        println(current.`val`)
        current = current.next
    }
}