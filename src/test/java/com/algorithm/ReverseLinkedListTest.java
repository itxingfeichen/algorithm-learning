package com.algorithm;

import com.algorithm.a1005.ReverseLinkedList;
import com.algorithm.common.ListNode;

class ReverseLinkedListTest {

    @org.junit.jupiter.api.Test
    void reverse() {

        final ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        final ListNode r = ReverseLinkedList.reverse(listNode);

        System.out.println(r);
    }
}