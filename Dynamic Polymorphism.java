  package com.gcettb;

  import java.util.Scanner;

  class Animal{
    public void speak()
    {
        System.out.println("Animal goes *brrrrr*");
    }
}
class Dog extends Animal{
    @Override
    public void speak()
    {
        System.out.println("dog goes *bouuuu*");
    }
}
class Cat extends Animal{
    @Override
    public void speak()
    {
        System.out.println("Cat goes *Mewww*");
    }
}

  public class Main {

    public static void main(String[] args) {
         //Polymorphism = many shapes/forms
        //Dynamic = after compilation(during runtime)
        //ex. A corvette is a : corvette, and a car, and a vehicle, and an object

        Scanner sc=new Scanner(System.in);
        Animal animal;
        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat):");
        int choice= sc.nextInt();
        if(choice==1)
        {
            animal=new Dog();
            animal.speak();
        }
        else if(choice==2)
        {
            animal=new Cat();
            animal.speak();
        }
        else {
            animal=new Animal();
            System.out.println("You enter Invalid Key..");
            animal.speak();
        }
        }
    }
