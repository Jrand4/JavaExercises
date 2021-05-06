package Exercises.Java;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String n, Double d){
        Customer c = findCustomer(n);

        if( c == null){
            c = new Customer(n,d);
            customers.add(c);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String n, Double d){
        Customer c = findCustomer(n);
        if(c != null){
            c.addTransaction(d);
            return true;
        }
        else return false;
    }
    private Customer findCustomer(String n){
        for(Customer c: customers){
            if(c.getName() == n) return customers.get(customers.indexOf(c));
        }
        return null;
    }
}
