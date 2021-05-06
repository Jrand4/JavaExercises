package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        Bank b = new Bank("Egg");
        b.addBranch("Salad");
        b.addCustomer("Salad","Mustard",33.49d);
        b.addCustomer("Salad","Mayo", 33.23d);
        b.addCustomer("Salad","Relish", 54.33d);
        b.addCustomer("Salad","Relish", 54.33d);
        b.addCustomerTransaction("Salad","Mustard", 44.33d);
        b.listCustomers("Salad",false);
        b.listCustomers("Salad",true);


    }
}
