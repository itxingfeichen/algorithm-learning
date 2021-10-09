package com.algorithm.a1007;

import com.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

class LevelOrderTest {

    @Test
    void levelOrder() {


        final TreeNode node4 = new TreeNode(4, null, null);
        final TreeNode node5 = new TreeNode(5, null, null);
        final TreeNode node2 = new TreeNode(2, node4, node5);
        final TreeNode node8 = new TreeNode(8, null, null);
        final TreeNode node7 = new TreeNode(7, null, node8);
        final TreeNode node6 = new TreeNode(6, node7, null);
        final TreeNode node3 = new TreeNode(3, node6, null);

        TreeNode treeNode = new TreeNode(1, node2, node3);
        final List<List<Integer>> levelOrder = LevelOrder.levelOrder(treeNode, false);
        System.out.println(levelOrder);

    }
}