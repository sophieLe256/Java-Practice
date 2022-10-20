package academy.programming.Challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialAmount); // add new transactions to initialize the amount

    }

    public void addTransactions(double amount){
        this.transactions.add(amount); // add amount into transactions
    }

    public String getName() {
        return name;
    }
}
