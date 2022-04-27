import java.util.Scanner;

public class array {
    public static boolean isAssending(int[] arr)
    {
        boolean isassending=true;
        for(int i=0;i<arr.length-1;i++)
        {
             if(arr[i]>arr[i+1])
             {
                 isassending =false;
             }
        }
        if(isassending)
        {
            System.out.println("the array is sorting assending order.");
        }
        else
        {
            System.out.println("The array is not sorting assending order");
        }
        return isassending;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int size=sc.nextInt();
          int [] arr=new int [size];
          for(int i=0;i<arr.length;i++)
          {
              arr[i]=sc.nextInt();
          }
         isAssending(arr);
           

    }
    
}
