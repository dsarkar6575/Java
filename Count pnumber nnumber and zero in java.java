package com.gcettb;

import java.util.Scanner;

public class Main {
    public static void ok(){
        int tot, num, i=0, countP=0, countN=0,countZ=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        tot = scan.nextInt();
        System.out.print("Enter " +tot+ " Numbers: ");
        while(i<tot)
        {
            num = scan.nextInt();
            if(num<0)
                countN++;
            else if(num>0)
                countP++;
            else 
                countZ++;
            i++;
        }

        System.out.println("\nTotal Positive Number: " +countP);
        System.out.println("Total Negative Number: " +countN);
        System.out.println("Total Zero number: "+countZ);

    }


    public static void main(String[] args) {
        ok();

    }
}
