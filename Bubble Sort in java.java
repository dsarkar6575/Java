package com.gcettb;


import java.util.Scanner;

public class Main {
    public static void PrintArray(int[] arr)
    {
        for (int i=0;i<= arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of array:");
        for (int i=0;i<=n-1;i++)
        {
           arr[i]= sc.nextInt();
        }

        //Bubble sort
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        PrintArray(arr);
    }
}
