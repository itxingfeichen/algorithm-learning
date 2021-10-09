package com.algorithm.common;

/**
 * 树型节点
 *
 * @author xf.chen
 * @date 2021/10/6 16:40
 * @since 1.0.0
 */
public class TreeNode {

    public int value;

    public int deep;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
