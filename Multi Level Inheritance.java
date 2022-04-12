package com.gcettb;
class Student{
    String fname;
    int age;
}
class students extends Student{
  String lname;
}
class Studetiled extends students{
    public void printInfo()
    {
        System.out.println("First name= "+fname);
        System.out.println("Last name = "+lname);
        System.out.println("Age = "+age);
    }
}

public class Main {
    public static void main(String[] args) {
       Studetiled s=new Studetiled();
       s.fname="Dipankar";
       s.lname="Sarkar";
       s.age=24;
       s.printInfo();

    }
}
