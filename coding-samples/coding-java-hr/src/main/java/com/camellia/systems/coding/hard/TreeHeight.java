package com.camellia.systems.coding.hard;

/**
 * Created by satishdvla on 08/04/17.
 */
class TreeNode {

    TreeNode leftChild, rightChild;

    public TreeNode(TreeNode leftChild, TreeNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    public TreeNode getRightChild() {
        return this.rightChild;
    }
}

public class TreeHeight {

    /* Compute the "maxDepth" of a tree -- the number of
      nodes along the longest path from the root node
      down to the farthest leaf node.*/
    static int maxDepth(TreeNode node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.leftChild);
            int rDepth = maxDepth(node.rightChild);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }



    public static int calculateHeight(TreeNode root) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        TreeNode leaf1 = new TreeNode(null, null);
        TreeNode leaf2 = new TreeNode(null, null);
        TreeNode node1 = new TreeNode(leaf1,null);
        TreeNode node = new TreeNode(node1, null);
        TreeNode root = new TreeNode(node, leaf2);

        System.out.println(TreeHeight.maxDepth(root)-1);
    }
}