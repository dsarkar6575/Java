package com.gcettb;

import java.util.*;

public class Main {
    public static int first=-1;
    public static int last=-1;
public static void findOccurence(String str,int idx,char element)
{
    if (idx==str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
    }
    char currChar=str.charAt(idx);
    if (currChar==element)
    {
        if (first==-1)
        {
            first=idx;
        }else {
            last=idx;
        }
    }
    findOccurence(str,idx+1,element);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        findOccurence(str,0,'d');

    }
}
