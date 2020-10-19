package com.cg.binarysearchtree;

public class BinarySearchTree<E extends Comparable> {
    private  Node<E> rootNode;

    public void add(E data){
        Node addnode=new Node(data);
        if(rootNode==null) rootNode=addnode;
        else {
            if(rootNode.data.compareTo(data)>0) rootNode.left=addnode;
            else rootNode.right=addnode;
        }
    }



    public int size(){
        int size =0;
        if(rootNode==null) return size;
        else {size++;
            if(rootNode.left!=null) size++;
            if(rootNode.right!=null) size++;
            return size;
        }
    }


}
