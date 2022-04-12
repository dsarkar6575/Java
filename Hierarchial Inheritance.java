package com.gcettb;
class Student{
    String fname;
    int age;
}
class students extends Student{
  String lname;
  public void print()
  {
      System.out.println("The last name is : "+lname);
  }
}
class Studetiled extends Student{
    public void printInfo()
    {
        System.out.println("First name= "+fname);
        System.out.println("Age = "+age);
    }
}

public class Main {
    public static void main(String[] args) {
       Studetiled s=new Studetiled();
       s.fname="Dipankar";
       s.age=24;
       s.printInfo();
//secound class object
       students ss=new students();
       ss.lname="Sarkar";
       ss.print();

    }
}
