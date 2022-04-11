package com.gcettb;

import java.util.Scanner;

public class Main {
    public static void Fibonacci(int n){
         int a=0;
         int b=1;
        System.out.print("The Fibonacci series is: ");
        System.out.print(a+" "+b+" ");
         for (int i=2;i<n;i++)
         {
             int c=a+b;
             System.out.print(c+" ");
           a=b;
           b=c;

         }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n number for fibonacci series: ");
       int n= sc.nextInt();
       Fibonacci(n);



    }
}
