package academy.programming.Challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    // Specify the branch name for customer and the initial transaction when we are adding a customer.
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    // Adding Transactions to new customer
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
            if(branch != null){
                return branch.addCustomerTransaction(customerName, amount);
            }
            return false;
        }

    private Branch findBranch(String branchName){
        for(int i = 0; i < this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    // create a List customer in case of the branch can not be found
    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers details for branch " + branch.getName());


            ArrayList<Customer> branchCustomers = branch.getCustomers();
            //we are getting all the list of customers for particular branch
            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");

                // if showTransactions was true when it called, that would show the list of all transactions for particular customer.
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();

                    // this loop is to list all the customers for a given branch and all the transactions for each customer
                    for(int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;

            // return fall if we could not find the branch
        } else {
            return false;
        }
    }























}
