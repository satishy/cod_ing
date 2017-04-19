package com.camellia.systems.coding.datastructs;

/**
 * Created by satishdvla on 07/04/17.
 */
public class TreeMap {

    public static void main(String args[]) {
        Tree theTree = new Tree();

        theTree.insert(50,1.5);
        theTree.insert(25,1.7);
        theTree.insert(75,1.9);

        Node found = theTree.find(25);

        if(found != null) {
            System.out.println("Found");

        } else {
            System.out.println("Not Found");
        }

    }

}
