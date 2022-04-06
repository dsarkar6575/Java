  package com.gcettb;

  import java.io.FileWriter;
  import java.io.IOException;

  public class Main {

    public static void main(String[] args) {
try {
    FileWriter writer= new FileWriter("poem.txt");
    writer.write("Roses are red\n Violets are blue\n Booty booty booty booty\n Rocking' everywhere!");
    writer.append("\n(A poem by Dipankar)");
    writer.close();
}
catch (IOException e)
{
    e.printStackTrace();
}
        }
    }
