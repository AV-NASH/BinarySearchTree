package com.cg.binarysearchtree;

public class BinarySearchTree<E extends Comparable> {
    private Node<E> rootNode=null;

    public void add(E data){
     rootNode= addRecursively(rootNode,data);

    }

    public Node<E> addRecursively(Node<E> rootNode, E data){
        Node addNode=new Node(data);
        if(rootNode==null) rootNode=addNode;
        else{
            if(rootNode.data.compareTo(data)>0) rootNode.left= addRecursively(rootNode.left,data);
            else {
                if(rootNode.data.compareTo(data)<0)rootNode.right= addRecursively(rootNode.right,data);
                else ;
            }
        }
        return rootNode;
    }


    public int size(){
        return sizeRecursively(rootNode,0);
    }

    public int sizeRecursively(Node<E> rootNode,int size){
        if(rootNode==null) return size;
        else{ size++;
            if(rootNode.left!=null) size=sizeRecursively(rootNode.left,size);
            if(rootNode.right!=null) size=sizeRecursively(rootNode.right,size);
            return size;
        }
    }

    public boolean search(E data){
        return searchRecursively(data,rootNode,false);
    }

    public boolean searchRecursively(E data, Node<E> rootNode,boolean searchResult){
        if(rootNode==null) return searchResult;
        else{
            if(rootNode.data.compareTo(data)==0) searchResult=true;
            else{
            if((rootNode.left!=null)&& !searchResult) searchResult=searchRecursively(data,rootNode.left,searchResult);
            if((rootNode.right!=null)&&!searchResult) searchResult=searchRecursively(data,rootNode.right,searchResult);
            }
            return searchResult;
        }
    }
}
