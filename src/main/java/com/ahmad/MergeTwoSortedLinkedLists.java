package com.ahmad;

import java.util.ArrayList;
import java.util.List;

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
            List<Integer> ord = new ArrayList<>();
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    ord.add(list1.val);
                    list1 = list1.next;
                } else {
                    ord.add(list2.val);
                    list2 = list2.next;
                }
            }
            if (list1 == null) {
                while (list2 != null) {
                    ord.add(list2.val);
                    list2 = list2.next;
                }
            } else if (list2 == null) {
                while (list1 != null) {
                    ord.add(list1.val);
                    list1 = list1.next;
                }
            }
            ListNode res = new ListNode(ord.get(0), null);
            ListNode pointer = res;
            for (int i = 1; i < ord.size(); i++) {
                int val = ord.get(i);
                ListNode temp = new ListNode(val);
                pointer.next = temp;
                pointer = pointer.next;
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