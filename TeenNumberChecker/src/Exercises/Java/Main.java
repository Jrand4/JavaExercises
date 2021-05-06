package Exercises.Java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasTeen(int x, int y, int z){
        if(isTeen(x) || isTeen(y) || isTeen(z)) return true;
        return false;
    }

    public static boolean isTeen(int i){
        return (i > 12 && i < 20) ? true : false;
    }
}
