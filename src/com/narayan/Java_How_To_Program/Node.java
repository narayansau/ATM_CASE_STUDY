package com.narayan.Java_How_To_Program;

public class Node <T> {
    private T data;
   private  Node <T> nextNode;

    public Node(T data, Node <T> nextNode) {
        setData(data);
        setNextNode(nextNode) ;
    }

    public Node(T data) {
        this( data , null);
    }

    public Node(Node <T> nextNode) {
        this.nextNode=nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data=data;
    }

    public Node <T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node <T> nextNode) {
        this.nextNode=nextNode;
    }
}
