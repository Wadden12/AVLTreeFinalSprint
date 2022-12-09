package com.keyin.tree;

import com.keyin.tree.avl.AVLMenu;
import com.keyin.tree.avl.AVLTree;
import com.keyin.tree.avl.AVLTreeInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        AVLTreeInterface  tree = new AVLTree();
        AVLMenu.runMenu(scanner, tree);
    }
//    AVLTreeInterface tree = new AVLTree();
//    tree.insert(10);
//    tree.insert(30);
//    tree.insert(20);
//    tree.insert(50);
//    tree.insert(5);
//    tree.insert(1);
//    System.out.println("In Order Traversal");
//    tree.inOrderTraversal();
//    System.out.println();
//    System.out.println("Pre Order Traversal");
//    tree.preOrderTraversal();
//    System.out.println();
//    System.out.println("Post Order Traversal");
//    tree.postOrderTraversal();
//    String check = tree.checkForEmptyTree();
//    System.out.println(check);
//    String message = tree.clearTree();
//    System.out.println(message);
//    check = tree.checkForEmptyTree();
//    System.out.println(check);
//    }
}
