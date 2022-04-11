package com.company;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
     /*   String numberS = sc.nextLine();
        System.out.println("Number is :" + numberS);
        String reverseS="";
        for (i=0;i<numberS.length(); i++) {
            //reverseS = numberS.substring(numberS.length());
            reverseS = reverseS.concat(numberS.substring((numberS.length()-1-i),(numberS.length()-i)));
            System.out.println("reverse Value :" + reverseS);

        } */
        for (int i=1; i <= 5; i++) {
            for (int j=1; j<=5; j++) {
                //System.out.print("(" + i + "," + j + ") ");
                if (i<=j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

    }
}


