import java.util.Scanner;

class Main {
    static void  decimaltobinary(int n)
  {
    int ans=0;
    int i=0;
    while (n!= 0)
    {
        int bits=(n&1);
        ans+=bits*Math.pow(10, i);
        n=n>>1;
        i++;
    
    }
    System.out.println(ans);
  }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int k=sc.nextInt();
      decimaltobinary(k);
      
    }
}
