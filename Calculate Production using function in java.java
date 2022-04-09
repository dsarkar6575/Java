package com.gcettb;

import java.util.Scanner;

public class Main {
    public static int multiply(int a,int b)
    {
        int mul=a*b;
        return mul;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two value for Multiply: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=multiply(a,b);
        System.out.println("The result of Multiplication is: "+c);


    }
}
