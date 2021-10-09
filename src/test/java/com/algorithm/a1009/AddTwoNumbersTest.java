package com.algorithm.a1009;

import com.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        final ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    @Test
    void addTwoNumbersCase2() {
        ListNode l1 = new ListNode(0, null);
        ListNode l2 = new ListNode(0, null);
        final ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    @Test
    void addTwoNumbersCase3() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));
        final ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
}