package com.cg.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void whenDataEntered_inBinaryTree_returnsCorrectSize() {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(60);
        binarySearchTree.add(25);
        Assert.assertEquals(5,binarySearchTree.size());
    }
}