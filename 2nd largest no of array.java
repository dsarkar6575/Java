import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static int slarge(int[]a,int n)
    {
        Arrays.sort(a);
        return a[n-3];
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.print("The second largest number is: ");
      int k=slarge(arr, size);
      System.out.println(k);
     
  }  
}
