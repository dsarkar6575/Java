package com.gcettb;
class pen{
    String color;
    String type;
    public void write()
    {
        System.out.println("It is writing.");
    }
    public void color()
    {
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

public class Main {
    public static void main(String[] args) {
        pen p=new pen();
        p.write();;
        p.color="black";
        p.type="Ball pen";
        p.color();
        pen p1=new pen();
        p1.write();
        p1.color="Red";
        p1.type="Green";
        p1.color();

    }
}
