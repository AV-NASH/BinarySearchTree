package com.cg.binarysearchtree;

public class BinarySearchTree<E extends Comparable> {
    public Node<E> rootNode=null;

    public void add(E data){
     rootNode= addrecursively(rootNode,data);

    }

    public Node<E> addrecursively(Node<E> rootNode,E data){
        Node addNode=new Node(data);
        if(rootNode==null) rootNode=addNode;
        else{
            if(rootNode.data.compareTo(data)>0) rootNode.left=addrecursively(rootNode.left,data);
            else rootNode.right=addrecursively(rootNode.right,data);
        }
        return rootNode;
    }


    public int size(){
        return sizerecursively(rootNode,0);
    }

    public int sizerecursively(Node<E> rootNode,int size){
        if(rootNode==null) return size;
        else{ size++;
            if(rootNode.left!=null) size=sizerecursively(rootNode.left,size);
            if(rootNode.right!=null) size=sizerecursively(rootNode.right,size);
            return size;
        }
    }

}
