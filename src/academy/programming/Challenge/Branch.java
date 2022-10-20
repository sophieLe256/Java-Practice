package academy.programming.Challenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        // if customerName would not be on the file and then create a new file with their name and initialAmount
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransactions(amount);
            return true;
        }
        return false;
    }

    //Create a function to check whether customer name already exist or not
    private Customer findCustomer(String customerName){
        for(int i = 0; i < this.customers.size(); i++){

            // We are going through the list of the customers that we have stored in this branch and testing it
            // Then we are retrieving them in the array lists as we go through each and every element
            // What we are doing is checking to see whether the name for that customer is the same, that have been passed to this method
            // Then add a new customer and their transaction methods by using this method.
            Customer checkedCustomer = this.customers.get(i);
            //if the name are matched, we are going to return the customer that from the arraylist
            if(this.customers.get(i).getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
