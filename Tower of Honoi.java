package com.gcettb;

import java.util.Scanner;


public class Main {
    public static void towerOfHanoi(int n,String src,String helper,String dis)
    {
        if (n==1)
        {
            System.out.println("Transfer disk "+n+" From "+src+" to "+dis);
            return;
        }
        towerOfHanoi(n-1,src,dis,helper);
        {
            System.out.println("Transfer disk "+n+" From "+src+" to "+dis);
        }
        towerOfHanoi(n-1,helper,src,dis);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,"S","H","D");

    }
}
