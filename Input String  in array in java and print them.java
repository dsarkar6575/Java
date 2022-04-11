package com.gcettb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        String [] arr=new String[n];
        System.out.println("Enter the element of  array:");
        for (int i=0;i<n;i++)
        {
            System.out.print("element name: ");
             arr[i]= sc.next();
        }
        System.out.println("The names are: ");
       for(int i=0;i<n;i++)
       {
           System.out.println(arr[i]);
       }
    }
}
