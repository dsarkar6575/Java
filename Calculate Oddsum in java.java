package com.gcettb;

import java.util.Scanner;

public class Main {
    public static int OddSum(int  a)
    {
      int sum=0;
      for (int i=1;i<=a;i+=2)
      {
          sum=sum+i;
      }
      return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a= sc.nextInt();
        int c=OddSum(a);
        System.out.println("The result of Oddsum: "+c);


    }
}
