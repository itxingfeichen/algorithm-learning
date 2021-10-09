package com.algorithm.a1006;

import com.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

class MinDeepTest {

    @Test
    void getMinDeep() {

        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3, new TreeNode(6, new TreeNode(7, null, null), null), null));
        final int minDeep = MinDeep.getMinDeep(treeNode);
        System.out.println(minDeep);

    }
}