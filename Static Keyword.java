package com.gcettb;

class Student{
    String name;//that is private member;

    static String school;
    public static void changeSchool()
    {
        school="newschool";
    }
                            //when define static keyword then the member is define for class
}                           //when define static then the memory is given only one time.
                            //when data member is input then the memory is take memory repeatedly.
public class Main {
    public static void main(String[] args) {
    Student.school="Sergram High School";
    Student obj=new Student();
    obj.name="Dipankar";
        System.out.println(Student.school);
        System.out.println(obj.name);

    }
}
