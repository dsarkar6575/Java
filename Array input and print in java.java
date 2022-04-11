package com.gcettb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of  array:");
        for (int i=0;i<n;i++)
        {
             arr[i]= sc.nextInt();
        }
        for (int j=0;j<n;j++)
        {
            System.out.println(arr[j]);
        }

    }
}
