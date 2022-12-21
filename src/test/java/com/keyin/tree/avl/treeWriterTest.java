package com.keyin.tree.avl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class treeWriterTest {
        public AVLTreeInterface createTree() {
            AVLTreeInterface tree = new AVLTree();
            // Create Tree
            tree.insert(25);
            tree.insert(12);
            tree.insert(55);
            tree.insert(44);
            tree.insert(33);
            tree.insert(20);
            tree.insert(5);
            tree.insert(7);
            tree.insert(11);

            return tree;
        }

        @Test
        void writeTest() {
            AVLTreeInterface tree = createTree();
            TreeWriter writer = new TreeWriter();
            writer.writeTreeJSON(tree, "jsonTest");
            File file = new File("jsonTest.json");
            file.delete();
        }

        @Test
        void readTest() {
            AVLTreeInterface tree = createTree();
            TreeWriter reader = new TreeWriter();
            reader.writeTreeJSON(tree, "jsonTest");
            AVLTreeInterface treeFromFile = reader.readTreeJSON("jsonTest");
            Assertions.assertEquals(tree.getRoot().toString(), treeFromFile.getRoot().toString());
            File file = new File("jsonTest.json");
            file.delete();
        }


    }


//    treeFromFile.setRoot(reader.readTreeJSON("jsonTest").getRoot());
