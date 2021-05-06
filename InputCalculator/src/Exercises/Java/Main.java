package Exercises.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            //System.out.print("Enter a number:");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                count++;
                sum+= scanner.nextInt();
                scanner.nextLine(); // Handle Enter Key
            }else break;
        }
        System.out.print("SUM = " + sum + " ");
        System.out.println("AVG = " + Math.round((double)sum / (double)count));
    }
}
