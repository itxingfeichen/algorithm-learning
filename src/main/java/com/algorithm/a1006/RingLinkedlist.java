package com.algorithm.a1006;

import com.algorithm.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 环状链表
 *
 * @author xf.chen
 * @date 2021/10/6 14:08
 * @since 1.0.0
 */
public class RingLinkedlist {

    public static boolean isRing(ListNode node) {

        if (node == null || node.next == null) {
            return false;
        }
        ListNode slow = node;
        ListNode fast = node.next;

        while (slow != fast) {
            if(fast == null || fast.next == null){
                return false;
            }
            slow  = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    private static boolean v1(ListNode node) {
        Set<ListNode> set = new HashSet<>();
        ListNode head = node;
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
