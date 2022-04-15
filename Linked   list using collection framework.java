package com.gcettb;

import java.util.*;


public class Main {

    public static void main(String[] args) {
      LinkedList<String> list=new LinkedList<>();
      list.add("a");
      list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());
        for (int i=0;i<list.size();i++)
        {
//            if (list.get(i)==key)     //this is use for searching
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

//        list.remove(index)                //remove any index

    }
}
