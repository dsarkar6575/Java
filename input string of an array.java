import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ok=sc.nextInt();
       String [] str=new String[ok];
       for(int i=0;i<ok;i++)
       {
           str[i]=sc.next();

       }
       System.out.println("the string is : ");
       for(int i=0;i<str.length;i++)
       {
           System.out.println(str[i]);
       }

    }
    
}
