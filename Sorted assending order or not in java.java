package com.gcettb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the element of  array:");
        for (int i=0;i<n;i++)
        {
            System.out.print("element: ");
             arr[i]= sc.nextInt();
        }
    boolean isAssending=true;
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isAssending=false;
            }
        }
        if (isAssending)
        {
            System.out.println("The array is sorted in assinding order.");
        }
        else
        {
            System.out.println("The array is not sorted assinding order.");
        }
    }
}
