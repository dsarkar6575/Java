package com.gcettb;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range of  natural number: ");
        int n= sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.print("The sum of natural is: "+sum);
         
    }
}
