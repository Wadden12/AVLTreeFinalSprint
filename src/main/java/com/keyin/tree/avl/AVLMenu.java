package com.keyin.tree.avl;

import java.util.Scanner;

public class AVLMenu {


    public static void  runMenu(Scanner scanner , AVLTreeInterface tree){
        char choice;

        do{
            System.out.println("Select a Option");
            System.out.println("1.Insert a Value");
            System.out.println("2.Check if Tree is Empty");
            System.out.println("3.Empty Tree");
            System.out.println("4.Display AVL Tree in Post Order");
            System.out.println("5.Display AVl Tree in Order");
            System.out.println("6.Display AVL Tree in Pre Order");
            System.out.println("7.Save Tree To File");
            System.out.println("8.Read Tree From File");
            System.out.println();
            System.out.println("Enter Choice");
            int selection = scanner.nextInt();
            switch (selection){
                case 1 :
                    System.out.println("Enter an value to insert in AVL Tree enter(-1) to quit");
                    while( selection != -1){
                         selection = scanner.nextInt();
                         if(selection != -1){
                             tree.insert(selection);
                             System.out.println(selection + " inserted");
                         }

                    }
                    break;
                case 2 :
                    String message = tree.checkForEmptyTree();
                    System.out.println(message);
                    break;

                case 3 :
                    String clearMessage = tree.clearTree();
                    System.out.println(clearMessage);
                    break;

                case 4 :
                    System.out.println("Display Post Order");
                    tree.postOrderTraversal();
                    break;
                case 5 :
                    System.out.println("Display in Order");
                    tree.inOrderTraversal();
                    break;
                case 6 :
                    System.out.println("Display Pre Order");
                    tree.preOrderTraversal();
                    break;

                case 7 : {
                        String fileName = "";
                        while (true) {
                            System.out.println("Enter the Name of the File To Save: ( extensions not needed)");
                            fileName = scanner.next();

                            if (!fileName.contains(".")) break;
                            else System.out.println("Error!  Do Not Include '.' ");
                        }

                        TreeWriter writer = new TreeWriter();
                        writer.writeTreeJSON(tree, fileName);
                        break;
                    }
                case 8 : {
                    String fileName = "";
                    while (true) {
                        System.out.println("Enter the name of the file to read: (do not include extensions)");
                        fileName = scanner.next();

                        if (!fileName.contains(".")) break;
                        else System.out.println("Error! Please do not include '.' characters.");
                    }
                    TreeWriter writer = new TreeWriter();
                    tree.setRoot(writer.readTreeJSON(fileName).getRoot());
                    System.out.println("Tree Info Loaded.");
                    break;
                }



                default:
                    System.out.println("Invalid Entry: Enter a number between (1-8)");
                    break;
            }

            System.out.println(" \n Press (Y) to continue: (any value) to quit \n");
            choice = scanner.next().charAt(0);
        }  while(choice == 'Y' || choice == 'y' );
    }
}
