package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int number){
        if(number < 0) number *= -1;
        int reverse = 0;
        int n = number;
        reverse = n % 10;
        while(n > 9){
            n = n / 10;
            reverse *= 10;
            reverse += n % 10;
        }
        return (number == reverse) ? true : false;
    }
}
