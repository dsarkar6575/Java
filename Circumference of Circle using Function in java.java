package com.gcettb;

import java.util.Scanner;

public class Main {
    public static double Circumference(double r)
    {
        double cf=2*3.14159*r;
        return cf;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value of Radius: ");
        double a= sc.nextDouble();
        double r=Circumference(a);
        System.out.printf("The Circumference is: %.5f",r); //using printf keyword

    }
}
