package com.gcettb;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //print space
            for (int k = 1; k <= n - i; k++)

            {
                System.out.print(" ");
            }
            //1st half
                for (int j = i; j>=1; j--)
                {
                    System.out.print(j);
                }
                //2nd half
               for(int j=2;j<=i;j++)
               {
                   System.out.print(j);
               }

                System.out.println();
            }
        }
}
