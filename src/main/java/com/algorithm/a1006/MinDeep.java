package com.algorithm.a1006;

import com.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 最小深度
 *
 * @author xf.chen
 * @date 2021/10/6 16:41
 * @since 1.0.0
 */
public class MinDeep {

    public static int getMinDeep(TreeNode root) {
        return deepFirst(root);
    }

    /**
     * 广度优先
     *
     * @param root
     * @return
     */
    private static int rangeFirst(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        root.deep = 1;
        while (!queue.isEmpty()) {
            final TreeNode poll = queue.poll();
            if (poll.left == null && poll.right == null) {
                return poll.deep;
            }

            if (poll.left != null) {
                final TreeNode left = poll.left;
                left.deep = poll.deep + 1;
                queue.offer(left);
            }
            if (poll.right != null) {
                final TreeNode right = poll.left;
                right.deep = poll.deep + 1;
                queue.offer(right);
            }


        }

        return 0;
    }

    /**
     * 深度优先
     *
     * @param root
     * @return
     */
    private static int deepFirst(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min = Integer.MAX_VALUE;

        if (root.left != null) {
            min = Math.min(getMinDeep(root.left), min);
        }

        if (root.right != null) {
            min = Math.min(getMinDeep(root.right), min);
        }

        return min + 1;
    }
}
