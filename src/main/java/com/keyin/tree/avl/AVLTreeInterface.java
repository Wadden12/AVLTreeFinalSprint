package com.keyin.tree.avl;

import java.util.List;

public interface AVLTreeInterface {

    String clearTree();

    String checkForEmptyTree();

    void insert(int value);

    void  inOrderTraversal();

    void postOrderTraversal();

    void preOrderTraversal();

    List<Integer> getTree();

}
