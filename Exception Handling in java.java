  package com.gcettb;

  import java.util.InputMismatchException;
  import java.util.Scanner;

  public class Main {

    public static void main(String[] args) {
       //Exception = an event that occurs during the execution of a program that, disrupts the normal flow of instructions.
        Scanner sc = new Scanner(System.in);
   try {


       System.out.println("Enter a whole number to divide: ");
       int x = sc.nextInt();
       System.out.println("Enter a whole number to divide by: ");
       int y = sc.nextInt();
       int z = x / y;
       System.out.println("Result: " + z);
   }
   catch (ArithmeticException e)
   {
       System.out.println("you can't divide by zero! IDIOT!");
   }
    catch (InputMismatchException e)
    {
        System.out.println("PLEASE ENTER A NUMBER OMFG!!!!");
    }
   catch (Exception e)
   {
       System.out.println("Something went wrong.");
   }
   finally {
       {
           sc.close();
       }
   }
        }
    }
