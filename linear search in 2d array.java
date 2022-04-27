import java.util.Scanner;

public class array {
    public static void printarray(int [][] arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               if(arr[i][j]==key)
                   {
                       System.out.printf(" The %d is the index number is : {%d,%d}",key,i,j);
                      
                   }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int row=sc.nextInt();
          int col=sc.nextInt();
          int [][] arr=new int [row][col];
          for(int i=0;i<row;i++)
          {
              for(int j=0;j<col;j++)
              {
                  arr[i][j]=sc.nextInt();
              }
          }
          System.out.println("Enter the searching element: ");
          int key=sc.nextInt();
          printarray(arr,key);
          
           

    }
    
}
