package com.algorithm.a1007;

import com.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 后序遍历（左 右 根）
 *
 * @author xf.chen
 * @date 2021/10/7 10:55
 * @since 1.0.0
 */
public class PostOrder {

    public static List<Integer> postOrder(TreeNode root, boolean isRecursion) {
        final ArrayList<Integer> objects = new ArrayList<>();
        if (isRecursion) {
            recursion(objects, root);
        } else {
            iterator(objects, root);
        }
        return objects;
    }


    /**
     * 迭代
     */
    private static void iterator(List<Integer> lists, TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (!stack.isEmpty() || root != null) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                lists.add(root.value);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
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
        recursion(lists, root.right);
        lists.add(root.value);
    }

}
