package com.camellia.systems.coding.datastructs;

/**
 * Created by satishdvla on 07/04/17.
 */
public class Node {

    Person p1;
    Node leftNode;
    Node rightNode;
    Node show;

    public Node() {
    }

    public Node(Person p1, Node leftNode, Node rightNode) {
        this.p1 = p1;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Person showData() {
        return this.p1;
    }

    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
