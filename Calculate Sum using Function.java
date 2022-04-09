package com.gcettb;

import java.util.Scanner;

public class Main {
    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a and b: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sum(a,b);
        System.out.println("The result is: "+c);


    }
}
