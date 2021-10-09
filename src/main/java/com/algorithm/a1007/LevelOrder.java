package com.algorithm.a1007;

import com.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层序遍历
 *
 * @author xf.chen
 * @date 2021/10/7 12:44
 * @since 1.0.0
 */
public class LevelOrder {

    public static List<List<Integer>> levelOrder(TreeNode root, boolean isRecursion) {
        final List<List<Integer>> objects = new ArrayList<>();
        if (isRecursion) {
//            recursion(objects, root);
        } else {
            iterator(objects, root);
        }
        return objects;
    }

    /**
     * 迭代
     */
    private static void iterator(List<List<Integer>> levels, TreeNode root) {
        if (root == null) {
            return;
        }
        // 声明一个队列
        Queue<TreeNode> queue = new LinkedList<>();

        // 第一层
        queue.offer(root);

        // 遍历流程
        while (!queue.isEmpty()) {
            final ArrayList<Integer> currList = new ArrayList<>();
            int currentSize = queue.size();
            // 开始遍历
            for (int i = 0; i < currentSize; i++) {
                final TreeNode treeNode = queue.poll();
                if (treeNode == null) {
                    break;
                }
                currList.add(treeNode.value);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            levels.add(currList);
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
