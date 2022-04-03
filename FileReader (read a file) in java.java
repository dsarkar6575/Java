  package com.gcettb;

  import java.io.FileNotFoundException;
  import java.io.FileReader;
  import java.io.IOException;

  public class Main {

    public static void main(String[] args) {
        //FileReader = read the contents of a file as a stream of characters.One by one read() returns an int value which contains the byte value
        //             when read() returns -1,there is no more data to be read
        try {
            FileReader fileReader=new FileReader("mouse.txt");
            int data= fileReader.read();
            while (data!=-1)
            {
                System.out.print((char)data);
             data  =   fileReader.read();
            }
            fileReader.close();
        }
        catch (FileNotFoundException e)                      //that catch function use or not that your chose
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
      }
    }
