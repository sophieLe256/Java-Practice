package OOP.List;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class GroceryList {
    public static void main(String[] args) {

    }
//    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
      groceryList.add(item);

    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list ");
        for(int i = 0; i < groceryList.size() ; i++){
            //i+1 cuz we want to start to count from 1
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.add(position, newItem);
        //add 1 to position cuz index always start at 0
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        //returns true if this list contains the specified element
        //More formally, return true if and only this list contains at least one element
//        boolean exits = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem); // search the arrayList and find the items
        if(position >= 0){
            return groceryList.get(position);
        }

        return null;
    }
}
