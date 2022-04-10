package com.gcettb;

import java.util.Scanner;

public class Main {
    public static void GraterThen(int  a,int b)
    {
           if(a>b)
           {
               System.out.println(a+" is grater of "+b);
           }
           else
           {
               System.out.println(b+" is grater of "+a);
           }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two number for compare: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        GraterThen(a,b);


    }
}
