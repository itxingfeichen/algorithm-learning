package com.algorithm.a1006;

import com.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RingLinkedlistTest {

    @Test
    void isRing() {

        final ListNode node5 = new ListNode(5, null);
        final ListNode node4 = new ListNode(4, node5);
        final ListNode node3 = new ListNode(3, node4);
        final ListNode next = new ListNode(2, node3);
        node5.next = node4;
        final ListNode listNode = new ListNode(1, next);
        System.out.println(RingLinkedlist.isRing(listNode));

    }
}