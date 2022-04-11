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
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           if (arr[i]>max)
           {
               max=arr[i];
           }
           if(arr[i]<min)
           {
               min=arr[i];
           }
       }
        System.out.println("The lagrest number is: "+max);
        System.out.println("The minimum number is : "+min);
    }
}
