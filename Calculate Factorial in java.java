package com.gcettb;

import java.util.Scanner;

public class Main {
    public static int Factorial(int a)
    {
        int mul=1;
        for(int i=1;i<=a;i++)
        {
            mul=mul*i;
        }
        return mul;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int a= sc.nextInt();
        int c=Factorial(a);
        System.out.println("The result of Factorial is: "+c);


    }
}
