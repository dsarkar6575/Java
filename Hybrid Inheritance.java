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
class studentSchool extends Studetiled{
     long roll;
    public void printroll()
    {
        System.out.println("The school roll number is : "+roll);
    }

}

public class Main {
    public static void main(String[] args) {
       studentSchool s=new studentSchool();              //this class is called first.
       s.fname="Dipankar";
       s.age=24;
       s.roll=111001190;
       s.printInfo();
       s.printroll();
//secound class object
       students ss=new students();
       ss.lname="Sarkar";
       ss.print();

    }
}
