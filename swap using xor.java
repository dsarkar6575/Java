import java.util.Scanner;

class Main {
    static void  swaptwono(int a,int b)
  {
       a=a^b;
       b=a^b;
       a=a^b;
   System.out.println("After swaping the number is a= "+a+" b= "+b);
  }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      swaptwono(a, b);;
      
    }
}
