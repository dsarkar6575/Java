package com.gcettb;

import java.util.*;

public class Main {
    public static void moveAll(String str,int idx,int count,String newString)
    {
        if (idx==str.length())
        {
            for (int i=0;i<count;i++)
            {
                newString+='x';
            }
                System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if (currChar=='x')
        {
            count++;
            moveAll(str,idx+1,count,newString);
        }else {
            newString+=currChar;
            moveAll(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str=sc.nextLine();
         moveAll(str,0,0,"");

    }
}
