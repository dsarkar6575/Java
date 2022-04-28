import java.util.Scanner;

public class Transpose {
    public static void printTranspose(int[][] arr,int row,int col)
    {
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(arr[j][i]+"  ");
            }
            System.out.println();
        }
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column number: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("after transpose the result is: ");
        printTranspose(arr, row, col);
        

    }
    
}
