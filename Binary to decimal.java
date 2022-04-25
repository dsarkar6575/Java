import java.util.Scanner;

class Main {
    static void  binarytodecimal(int n)
  {
    int ans=0;
    int i=0;
    while (n!= 0)
    {
        int bits=n%10;
        ans+=(bits*Math.pow(2,i));
        n = n/10;
        i++;
    }
    System.out.println(ans);
  }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int k=sc.nextInt();
      binarytodecimal(k);
      
    }
}
