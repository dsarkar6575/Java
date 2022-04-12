package com.gcettb;
class Student{
    String name;
    int age;
    Student()                                    //Default constructor
    {
        System.out.println("I am default constructor.");
    }
    Student(String name,int age)                 //Parameterized constructor
    {
        System.out.println("This is parameterized constructor..");
        this.name=name;
        this.age=age;
        System.out.println("The name is: "+name);
        System.out.println("The age is "+age);
    }
    Student(Student s)                          //Copy constructor
    {
        System.out.println("This is copy constructor..");
        this.name=s.name;
        this.age=s.age;
        System.out.println("The name is: "+s.name);
        System.out.println("The age is "+s.age);

    }

}

public class Main {
    public static void main(String[] args) {
       Student s=new Student();
       Student s1=new Student("Dipankar",24);
       Student s2=new Student(s1);

    }
}
