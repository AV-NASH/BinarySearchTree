package com.cg.binarysearchtree;

public class Node<E extends  Comparable> {
    E data;
    Node left;
    Node right;

    public Node(E data) {
        this.data = data;
        left=null;
        right=null;
    }
}
