package com.algorithm.a1007;

import com.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 前序遍历（根 左 右）
 *
 * @author xf.chen
 * @date 2021/10/7 10:55
 * @since 1.0.0
 */
public class PreOrder {

    public static List<Integer> preOrder(TreeNode root) {
        final ArrayList<Integer> objects = new ArrayList<>();
        iterator(objects, root);
        return objects;
    }


    /**
     * 迭代
     */
    private static void iterator(List<Integer> lists, TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            final TreeNode pop = stack.pop();
            lists.add(pop.value);
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
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
        lists.add(root.value);
        recursion(lists, root.left);
        recursion(lists, root.right);
    }

}
