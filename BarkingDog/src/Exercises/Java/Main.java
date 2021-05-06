package Exercises.Java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay > 23 || hourOfDay < 0) return false;
        if(barking && (hourOfDay < 8 || hourOfDay > 22)) return true;
        return false;
    }
}
