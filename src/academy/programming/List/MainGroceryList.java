package academy.programming.List;

import java.util.ArrayList;
import java.util.Scanner;
public class MainGroceryList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 = To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        String itemNum = scanner.nextLine();
//        int itemNum = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("Enter replacement items: ");
        String newItems = scanner.nextLine(); // print the nextLine

//        groceryList.modifyGroceryItem(itemNum-1, newItems); //deducing 1 number cuz arrayList count from 0, but we want to start to count from 1, so we have to deduce 1 number form the item number that has been entered by the users
        groceryList.modifyGroceryItem(itemNum, newItems);
    }

    public static void removeItem(){
        System.out.println("Enter item number: ");
//        int itemNum = scanner.nextInt();
//        scanner.nextLine();
        String itemNum = scanner.nextLine();
//        groceryList.removeGroceryItem(itemNum-1);
        groceryList.removeGroceryItem(itemNum);
    }

    public static void searchItem(){
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
//        if(groceryList.findItem(searchItem) != null){
//            System.out.println("Found " + searchItem + " in our grocery");
//        } else {
//            System.out.println(searchItem + " is not in the list");
//        }
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }

    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
