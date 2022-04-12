package com.gcettb;

interface Animal{
    int eyes=2;//all number are eyes is fixed.
     void walk();//ONly abstract functon are alow;
}
interface Cow{

}
class Horse implements Animal,Cow{              //multiple inheritence = in java is not in class only interfact is use for multiple inheritence.

    @Override
    public void walk() {
        System.out.println("Walks on 4 legs..");
        System.out.println("Eyes= "+eyes);
    }
}
public class Main {
    public static void main(String[] args) {
       Horse h=new Horse();
       h.walk();

    }
}
