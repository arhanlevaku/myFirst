package com.company;

public class arrayPractice {
    public static void main(String[] args) {
        System.out.println("Working on Arrays");
        int A[] = new int[10];
        int B[] = {1,2,3,4,5};

       /* for (int i=0; i<A.length; i++) {
            A[i] = i;
            System.out.println(A[i]);
        }
        int sum = 0;
        for(int x: A) {
            sum = sum + x;
            System.out.print(x + ", ");
        }
        System.out.println("Sum of the elements in the array " + sum); */

        int temp = 0;
        for (int i = 0; i < B.length; i++) {
            if (i == 0) {
                temp = B[i];
            } else {
                B[i - 1] = B[i];
            }

        }
        B[B.length-1] = temp;

        System.out.println("Length of Array :" + B.length);
        for (int x: B) {
            System.out.print(x + " ");
        }
    }
}
