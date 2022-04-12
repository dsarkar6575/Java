package com.gcettb;

import java.util.*;

public class Main {
    public static int first = -1;
    public static int last = -1;

    public static boolean issorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            //array is sorted till now
            issorted(arr, idx + 1);
        } else {
            return false;
        }
        return arr[idx]<arr[idx+1];
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(issorted(arr,0));


    }
}
