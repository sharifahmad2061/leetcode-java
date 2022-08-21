package com.ahmad;

public class MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            ListNode topNode = list1;
            ListNode bottomNode = list2;
            ListNode tempNode = null;
            while (topNode.next != null || bottomNode.next != null) {
                if (topNode.val <= bottomNode.val) {
                    tempNode = new ListNode(topNode.next.val, topNode.next.next);
                    topNode.next = bottomNode;
                    topNode = tempNode;
                } else {
                    tempNode = new ListNode(bottomNode.next.val, bottomNode.next.next);
                    bottomNode.next = topNode;
                    bottomNode = tempNode;
                }
            }
            if (topNode.val <= bottomNode.val) {
                topNode.next = bottomNode;
            } else {
                bottomNode.next = topNode;
            }
            return list1;
        } else if (list1 == null)
            return list2;
        else
            return list1;
    }
}

// 1 2 4 list1
// 1 3 4 list2

// 2 4 topNode
// 1 1 3 4 list1
// 1 3 4 list2 bottomNode

// 2 4 topNode
// 1 1 3 4 list1
// 1 2 4 list