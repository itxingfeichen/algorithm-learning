package com.algorithm.a1005;

import com.algorithm.common.ListNode;

/**
 * 反转链表
 *
 * @author xf.chen
 * @date 2021/10/5 07:59
 * @since 1.0.0
 */
public class ReverseLinkedList {

    /**
     * 反转链表
     */
    public static ListNode reverse(ListNode head) {

        return recursion(head);
    }

    /**
     * 递归
     */
    private static ListNode recursion(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    /**
     * 迭代反转
     */
    private static ListNode iterator(ListNode head) {
        ListNode curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
