package Exercises.Java;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double d) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(d);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(Double d){
        transactions.add(d);
    }
}
