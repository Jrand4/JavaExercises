package Exercises.Java;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {55,23,22,11,453,9,1,33, 5};
        reverse(myArray);
    }

    private static void reverse(int[] A){
        System.out.print("Array = [");
        for (int i = 0; i < A.length; i++) {
            if(i == A.length - 1)  System.out.print(A[i] + "]");
            else    System.out.print(A[i] + ",") ;
        }
        System.out.println("");
        int maxIndex = A.length - 1;
        int halfIndex = A.length / 2;
        for (int i = 0; i < halfIndex; i++) {
            int temp = A[i];
            A[i] = A[maxIndex - i];
            A[maxIndex - i] = temp;
        }

        System.out.print("Reversed Array = [");
        for (int i = 0; i < A.length; i++) {
            if(i == A.length - 1)  System.out.print(A[i] + "]");
            else    System.out.print(A[i] + ",") ;
        }
    }
}
