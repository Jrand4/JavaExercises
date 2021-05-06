package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(433560));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        int n = number;
        int sum = 0;
        int t = 0;
        while(n > 0){
            t = n % 10;
            if(t % 2 == 0) sum += t;
            n = n / 10;
        }
        return sum;
    }
}
