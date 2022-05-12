/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     	Scanner sc=new Scanner(System.in);
     	int size=sc.nextInt();
     	int [] arr=new int[size];
     	for(int i=0;i<size;i++)
     	{
     	    arr[i]=sc.nextInt();
     	}
     	for(int i=0;i<size;i++)
     	{
     	    int j;
     	    for(j=0;j<size;j++)
     	    {
     	        if(i!=j && arr[i]==arr[j])
     	        {
     	            break;
     	        }
     	    }
     	    if(j==size)
     	    {
     	        System.out.println(arr[i]);
     	    }
     	   
     	}
	
	}
}
