package com.gcettb;

import java.util.Scanner;

public class Main {
    public static void Eligible(double age)
    {
         if (age>=18)
         {
             System.out.println("You are Eligible For vote.");
         }
         else
         {
             System.out.println("Not Eligible for vote..");
         }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        double a= sc.nextDouble();
         Eligible(a);

    }
}
