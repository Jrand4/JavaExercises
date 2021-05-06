package Exercises.Java;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact c){
        int i = findContact(c.getName());
        if(i == -1){
            myContacts.add(c);
            return true;
        }
        else return false;
    }

    public boolean updateContact(Contact oldC, Contact c){
        int i = findContact(oldC.getName());
        if(i > -1){
            myContacts.set(myContacts.indexOf(oldC),c);
            return true;
        }
        else return false;
    }
    public boolean removeContact(Contact c){
        int i = findContact(c.getName());
        if(i > -1){
            myContacts.remove(myContacts.indexOf(c));
            return true;
        }
        else return false;
    }
    private int findContact(Contact c){
        return findContact(c.getName());
    }
    private int findContact(String s){
        for (Contact c: myContacts) {
            if(c.getName() == s || c.getPhoneNumber() == s) return myContacts.indexOf(c);
        }
        return -1;
    }
    public Contact queryContact(String s){
        int i = findContact(s);
        return (i == -1) ? null : myContacts.get(i);
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
