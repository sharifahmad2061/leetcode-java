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

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        else if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        else {
            ListNode res = null;
            if (list1.val <= list2.val) {
                res = new ListNode(list1.val, list2);
                list1 = list1.next;
            } else {
                res = new ListNode(list2.val, list1);
                list2 = list2.next;
            }
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    ListNode temp = new ListNode(list1.next.val, list1.next.next);
                    list1.next = list2;
                    list1 = temp;
                } else {
                    ListNode temp = new ListNode(list2.next.val, list2.next.next);
                    list2.next = list1;
                    list2 = temp;
                }
            }
            return res;
        }
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