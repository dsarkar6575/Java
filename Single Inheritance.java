package com.gcettb;
class vehicle{
    double speed;
    void go(){
        System.out.println("This vehicle is moving.");
    }
    void  stop(){
        System.out.println("This vegicle is stopped.");
    }
}
class car extends vehicle{

}

public class Main {

    public static void main(String[] args) {

            //Inheritance = The process where one class acquires,the attributes and methods of another.
    car obj =new car();
    obj.go();
    obj.stop();
        vehicle obj1=new vehicle();
        obj1.go();
        obj1.stop();

        }
    }
