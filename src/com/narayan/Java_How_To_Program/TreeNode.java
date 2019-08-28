package com.narayan.Java_How_To_Program;

public class TreeNode   <T extends Comparable<T> > {
     TreeNode<T>  treeLeftNode;  //left children
     T data;  // data
     TreeNode<T>  treeRightNode; // right children

    public TreeNode(TreeNode <T> treeLeftNode, T data, TreeNode <T> treeRightNode) {
        this.treeLeftNode=treeLeftNode;
        this.data=data;
        this.treeRightNode=treeRightNode;
    }

    public TreeNode(T data) {
        this( null , data  , null);

    }
    public void insert ( T insertValue ) {
        if ( insertValue.compareTo( data ) < 0 ) {
            if ( treeLeftNode == null) {
                treeLeftNode=new TreeNode <T>( insertValue );
                System.out.println( "Left node " + insertValue );
            }
            else
                treeLeftNode.insert( insertValue );
        } else if  (  insertValue.compareTo( data ) > 0 ) {
             if ( treeRightNode == null) {
                 treeRightNode=new TreeNode <T>( insertValue );
                 System.out.println( "Right node " + insertValue );
             }
             else
                 treeRightNode.insert( insertValue );
        }

    }// end insert
} // end Class Treenode
