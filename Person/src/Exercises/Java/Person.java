package Exercises.Java;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String s){
        firstName = s;
    }
    public void setLastName(String s){
        lastName = s;
    }
    public void setAge(int i){
        age = (i >= 0 && i <= 100) ? i : 0;
    }
    public boolean isTeen(){
        return (age > 12 && age < 20);
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()) return "";
        else if(firstName.isEmpty() && !lastName.isEmpty()) return lastName;
        else if(!firstName.isEmpty() && lastName.isEmpty()) return firstName;
        else return firstName + " " + lastName;
    }
}
