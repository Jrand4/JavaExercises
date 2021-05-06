package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(527040);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0L){
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600L;
        long days = (minutes % 525600L) / 1440L;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
