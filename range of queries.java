public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int mat[][]={{0,3},{2,5},{3,4},{1,3}};
		int presum[]=new int[arr.length];
		   presum[0]=arr[0];
		   for(int i=1;i<arr.length;i++)
		   {
		       presum[i]=presum[i-1]+arr[i];
		   }
		   int ans[]=new int[mat.length];
		   for(int i=0;i<mat.length;i++)
		   {
		       int s=mat[i][0];
		       int e=mat[i][1];
		       if(s==0)
		       {
		           ans[i]=presum[e];
		       }else{
		           ans[i]=presum[e]-presum[s-1];
		       }
		   }
		   
		   for(int i=0;i<mat.length;i++)
		   {
		       System.out.print(ans[i]+" ");
		   }
	}
}
