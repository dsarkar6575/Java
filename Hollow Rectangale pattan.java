package com.gcettb;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
      for (int i=1;i<=n-1;i++)
      {
          for (int j=1;j<=n;j++)
          {
              if(i==1||i==n-1||j==1||j==n)
              {
                  System.out.print("*"+" ");
              }
              else
              {
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
         
    }
}
