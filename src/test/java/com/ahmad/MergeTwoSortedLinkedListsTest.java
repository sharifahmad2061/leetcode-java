package com.ahmad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedLinkedListsTest {

    MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();

    @Test
    void test1() {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode actual = mergeTwoSortedLinkedLists.mergeTwoLists2(listNode1, listNode2);
        ListNode expected = new ListNode(
                1, new ListNode(
                        1, new ListNode(
                                2, new ListNode(
                                        3, new ListNode(
                                                4, new ListNode(
                                                        4, null))))));
        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void test2() {
        ListNode listNode1 = new ListNode(2, null);
        ListNode listNode2 = new ListNode(1, null);
        ListNode actual = mergeTwoSortedLinkedLists.mergeTwoLists2(listNode1, listNode2);
        ListNode expected = new ListNode(
                1, new ListNode(
                        2, null));
        Assertions.assertEquals(expected.toString(), actual.toString());

    }
}
