package com.narayan.Java_How_To_Program;

public class LinkList <T>   {
    private  Node <T> firstNode;
    private  Node <T> lastNode;
    private String name;

    public LinkList() {
        this("list" ,null, null);
    }

    public LinkList(String name) {
        this(name ,null, null);
    }

    public LinkList(String name ,Node <T> firstNode, Node <T> lastNode)  {
        this.firstNode=firstNode;
        this.lastNode=lastNode;
        this.name=name;
    }
    public boolean isEmpty()
    {
        return firstNode == null;
    }  // end isEmpty
    public  void InsertAtFront( T insertItem) {
        if ( isEmpty())
            firstNode=lastNode=new Node< T>( insertItem );
        else
            firstNode = new Node <T>( insertItem, firstNode );
    }// end InsertAtFront
    public void insertAtBack( T insertItem) {
        if ( isEmpty())
            firstNode=lastNode=new Node< T>( insertItem );
        else {
           Node <T> newNode = new Node<T>( insertItem );

            lastNode.setNextNode( (Node <T>) newNode );
             lastNode=newNode;
        }

    } // end insertAtBack
}
