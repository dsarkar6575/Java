import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int size=sc.nextInt();
          int [] arr=new int [size];
          for(int i=0;i<arr.length;i++)
          {
              arr[i]=sc.nextInt();
          }
           for(int i=0;i<arr.length;i++)
           {
               for(int j=i+1;j<arr.length;j++)
               {
                   if(arr[j]<arr[j+1])
                   {
                       System.out.println("The array is assending order.");
                       break;
                   }
                   else{
                       System.out.println("The array is not an assending order.");
                       break;
                   }
               }
               break;
           }

    }
    
}
