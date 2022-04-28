import java.util.Scanner;

public class str {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String a=sc.nextLine();
     StringBuilder sb=new StringBuilder(a);
     
     for(int i=0;i<sb.length()/2;i++)
     {
         int front=i;
         int back=sb.length()-1-i;
         char fchar=a.charAt(front);
         char bchar=a.charAt(back);
         sb.setCharAt(front, bchar);
         sb.setCharAt(back,fchar );
     }
     System.out.println(sb);
    }
}
