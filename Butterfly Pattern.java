package com.gcettb;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();

        //Upper half
      for (int i=1;i<=n;i++)
      {
          for (int j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          for (int k=1;k<=2*(n-i);k++)   //print space
          {
              System.out.print(" ");
          }
          for (int j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          System.out.println();
      }

      //down half
        for (int i=n;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         
    }
}
