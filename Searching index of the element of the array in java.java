package com.gcettb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of  array:");
        for (int i=0;i<n;i++)
        {
            System.out.print("element: ");
             arr[i]= sc.nextInt();
        }
        System.out.println("Enter the searching element: ");
        int key= sc.nextInt();
        for (int j=0;j<arr.length;j++)
        {
           if (arr[j]==key)
           {
               System.out.println("The "+key+" index is : "+j);
               break;
           }
        }

    }
}
