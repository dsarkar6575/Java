package com.gcettb;


public class Main {
    public static void printArray(int[] arr)
    {
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={7,8,3,2,1};
        for(int i=0;i<= arr.length-1;i++)
        {
          int current=arr[i];
          int j=i-1;
          while (j>=0 && current<arr[j])
          {
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=current;             //for placement

        }


    printArray(arr);
    }
}
