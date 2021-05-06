package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("9727272688");
        System.out.println(m.addNewContact(new Contact("Fred","1112223333")));
        System.out.println(m.addNewContact(new Contact("Fred","1112223333")));
        m.printContacts();
    }
}
