package com.algorithm.a1007;

import com.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历（左 根 右）
 *
 * @author xf.chen
 * @date 2021/10/7 10:55
 * @since 1.0.0
 */
public class MiddleOrder {

    public static List<Integer> middleOrder(TreeNode root) {
        final ArrayList<Integer> objects = new ArrayList<>();
        iteratorv1(objects, root);
        return objects;
    }


    /**
     * 迭代
     */
    private static void iterator(List<Integer> lists, TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            final TreeNode pop = stack.pop();
            lists.add(pop.value);
            root = pop.right;
        }

    }

    private static void iteratorv1(List<Integer> lists, TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {

            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                final TreeNode pop = stack.pop();
                lists.add(pop.value);
                root = pop.right;
            }

        }

    }


    /**
     * 递归
     */
    private static void recursion(List<Integer> lists, TreeNode root) {

        // 元素没有了则跳出当前递归
        if (root == null) {
            return;
        }
        recursion(lists, root.left);
        lists.add(root.value);
        recursion(lists, root.right);
    }

}
