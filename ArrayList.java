package com.gcettb;

import java.util.*;

public class Main {

    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
//      ArrayList<String> list1=new ArrayList<>();
//      ArrayList<Boolean> list2=new ArrayList<>();

        //add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get element
        int element=list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loops
        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sort
        Collections.sort(list);
        System.out.println(list);

    }
}
