package Exercises.Java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static double area(double radius){
        if(radius < 0d) return -1.0d;
        return Math.PI * radius * radius;
    }
    public static double area(double x, double y){
        if(x < 0d || y < 0d) return -1.0d;
        return x * y;
    }
}
