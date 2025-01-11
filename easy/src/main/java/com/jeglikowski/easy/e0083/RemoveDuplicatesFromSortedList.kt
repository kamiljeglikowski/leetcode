package com.jeglikowski.easy.e0083

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
internal class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

internal class Solution83 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }

        val resultHead = ListNode(head.`val`)
        var currentItemFromResult : ListNode? = resultHead
        var currentValue = head.`val`
        var currentItemFromHead: ListNode? = head.next

        do {
            if (currentItemFromHead != null){
                if (currentItemFromHead.`val` > currentValue){
                    currentValue = currentItemFromHead.`val`
                    currentItemFromResult!!.next = ListNode(currentItemFromHead.`val`)
                    currentItemFromResult = currentItemFromResult.next

                }
                currentItemFromHead = currentItemFromHead!!.next
            }

        } while (currentItemFromHead != null)

        return resultHead
    }
}