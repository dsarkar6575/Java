package com.gcettb;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
      for (int i=1;i<=n;i++)
      {

          for (int k=1;k<=2*(n-i);k++)   //print space
          {
              System.out.print(" ");
          }
          for (int j=1;j<=n;j++)
          {
              System.out.print("*"+" ");
          }
          System.out.println();
      }
    }
}
