package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(-5,-3));
    }
    public static boolean isOdd(int number){
        return (number % 2 == 0 || number < 0) ? false : true;
    }
    public static int sumOdd(int start, int end){
        if(start > end || start < 0 || end < 0) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++){
            if(isOdd(i)) sum += i;
        }
        return sum;
    }
}
