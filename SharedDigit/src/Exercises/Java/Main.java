package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(45,67));
    }
    public static boolean hasSharedDigit(int x, int y){
        if(x < 10 || x > 99 || y < 10 || y > 99) return false;
        if(x / 10 == y / 10 || x / 10 == y % 10 || x % 10 == y / 10 || x % 10 == y % 10) return true;
        else return false;
    }
}
