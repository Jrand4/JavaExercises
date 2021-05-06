package Exercises.Java;

public class Main {

    public static void main(String[] args) {
	    if(areEqualByThreeDecimalPlaces(300.0311d,300.031d)){
            System.out.println("True");
        }
	    else{
            System.out.println("False");
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        if((long)(x*1000d) == (long)(y*1000d)){
            return true;
        }
        else
            return false;
    }
}
