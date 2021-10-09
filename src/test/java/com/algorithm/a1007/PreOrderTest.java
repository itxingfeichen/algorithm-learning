package com.algorithm.a1007;

import com.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTest {

    @Test
    void preOrder() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3, new TreeNode(6, new TreeNode(7, null, null), null), null));


        final List<Integer> integers = PreOrder.preOrder(treeNode);
        System.out.println(integers);
    }
}