  package com.gcettb;
import java.io.File;
  public class Main {

    public static void main(String[] args) {
     //File = An abstract representation of file and directory pathname
       File file=new File("okkk.txt");
       if (file.exists())
       {
           System.out.println("That file exists! : O!");
           System.out.println(file.getPath());           //only file name
           System.out.println(file.getAbsolutePath());   //path of the file
           System.out.println(file.isFile());            //boolean type true or false
           file.delete();                                //For delete the file
       }
       else {
           System.out.println("That file doesn't exist...");
       }
        }
    }
