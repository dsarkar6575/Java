import java.util.Scanner;

class Main {
    static void  oddoreven(int n)
  {
   int check=(n&1);
   if(check==0)
   {
     System.out.println("This number is Even.");
   }
   else
   {
     System.out.println("This number is odd.");
   }
   
  }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int k=sc.nextInt();
      oddoreven(k);
      
    }
}
