package Exercises.Java;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String b){
        if(findBranch(b) == null){
            branches.add(new Branch(b));
            return true;
        }
        else return false;
    }
    public boolean addCustomer(String branchName, String customerName, Double trans){
        Branch b = findBranch(branchName);
        if(b != null){
            return b.newCustomer(customerName,trans);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, Double trans){
        Branch b = findBranch(branchName);
        if(b != null) return b.addCustomerTransaction(customerName,trans);
        else return false;
    }
    private Branch findBranch(String s){
        for(Branch b: branches){
            if(b.getName() == s) return branches.get(branches.indexOf(b));
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean listTrans){
        Branch b = findBranch(branchName);
        if(b != null){
            for(Customer c:b.getCustomers()){
                System.out.println("Customer: " + c.getName() + "[" + (b.getCustomers().indexOf(c) + 1) + "]");
                if(listTrans) {
                    System.out.println("Transactions");
                    for (int i = 0; i < c.getTransactions().size(); i++) {
                        System.out.println("[" + (i + 1) + "]\t Amount " + c.getTransactions().get(i));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
