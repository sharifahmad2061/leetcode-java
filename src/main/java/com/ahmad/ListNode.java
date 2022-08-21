package com.ahmad;

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        ListNode tempNode = new ListNode(val, next);
        while (tempNode.next != null) {
            result.append(tempNode.val);
            result.append(',');
        }
        result.append(tempNode.val);
        result.append(']');
        return result.toString();
    }
}