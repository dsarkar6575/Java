package com.gcettb;

import java.util.Scanner;

public class Main {
    public static float Average(float a,float b,float c)
    {
       float avg=(a+b+c)/3;
       return avg;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float d= sc.nextFloat();
        float c=Average(a,b,d);
        System.out.println("The result of Average is: "+c);


    }
}
