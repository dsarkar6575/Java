package com.gcettb;

import java.util.Scanner;

public class Main {
    public static int Sqrt(int a,int b){
        int mul=1;
     for (int i=1;i<=b;i++)
     {
      mul*=a;
     }
        return mul;
    }


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
       int a= sc.nextInt();
        System.out.print("Enter the power: ");
       int b= sc.nextInt();
       int c=Sqrt(a,b);
        System.out.print(a+ " to the power of "+b+" is: "+c);

    }
}
