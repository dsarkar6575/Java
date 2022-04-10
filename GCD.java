package com.gcettb;

import java.util.Scanner;

public class Main {
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        if(b==0)
            return a;
        if (a==b)
            return a;
        if (a>b)
            return gcd(a-b,b);
        return gcd(a,b-a);
    }


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter first value: ");
       int a= sc.nextInt();
        System.out.print("Enter secound value: ");
       int b= sc.nextInt();
        System.out.println(gcd(a,b));


    }
}
