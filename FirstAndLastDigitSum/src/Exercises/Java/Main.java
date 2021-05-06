package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }

    public static int sumFirstAndLastDigit(int number){
        // Sum first and last number
        if(number < 0) return -1;
        int n = number;
        int last = n % 10;
        while(n > 9){
            n = n / 10;
        }
        return n + last;
    }
}
