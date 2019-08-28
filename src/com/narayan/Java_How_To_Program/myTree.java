package com.narayan.Java_How_To_Program;

public class myTree <T extends Comparable<T>> {
    TreeNode <T> root;

    public myTree(TreeNode <T> root) {

        this.root=root;
    }

    public myTree() {
        this(null);
    }

    public void insertNode( T insertValue){
        if ( root == null) {
            System.out.println( "Root = " + insertValue );
            root=new TreeNode <T>( insertValue );
        }
        else
            root.insert( insertValue );
    }

    public void PreOrderTraversal( ) {
        preOrderHelper(  root );
    }

    private void preOrderHelper( TreeNode <T> node) {
        if ( node == null)  return;
        System.out.printf(" %s ", node.data);
        preOrderHelper( node.treeLeftNode );
        preOrderHelper( node.treeRightNode );
    }
}
