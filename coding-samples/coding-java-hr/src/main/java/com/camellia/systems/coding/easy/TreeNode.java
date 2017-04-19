package com.camellia.systems.coding.easy;

/**
 * Created by satishdvla on 07/04/17.
 */
public class TreeNode {

    private int treeNumber;

    private TreeNode leftNode;

    private TreeNode rightNode;

    public TreeNode(int treeNumber, TreeNode leftNode, TreeNode rightNode) {
        this.treeNumber = treeNumber;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getTreeNumber() {
        return treeNumber;
    }

    public void setTreeNumber(int treeNumber) {
        this.treeNumber = treeNumber;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
