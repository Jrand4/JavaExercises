package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if(count == 5) break;
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " has met the condition.");
                sum += i;
                count++;
            }
        }
        System.out.println(sum + " is the total sum.");
    }
}
