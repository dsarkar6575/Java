package com.gcettb;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String ,String> capitalMap=new HashMap<> ();
        capitalMap.put("India","New Delhi");
        capitalMap.put("usa","washington dc");
        capitalMap.put("uk","london");
        capitalMap.put("ll","london22");
        capitalMap.put(null,"Berlin");
        System.out.println(capitalMap.get("usa"));

    }
}
