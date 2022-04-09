package com.gcettb;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //Upper half
        for (int i = 1; i <= n; i++) {
            //print space
            for (int k = 1; k <= n - i; k++)

            {
                System.out.print(" ");
            }
            //1st half
                for (int j = 1; j<=i; j++)
                {
                    System.out.print("*"+" ");
                }


                System.out.println();
            }
        //Lower half

        for (int i = n; i >= 1; i--) {
            //print space
            for (int k = 1; k <= n - i; k++)

            {
                System.out.print(" ");
            }
            //1st half
            for (int j = 1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }


            System.out.println();
        }
        }
}
