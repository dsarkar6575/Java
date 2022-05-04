public class jj
{
    static void firstNonRepeatingElement(int A[])
    {
        int n = A.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (j == n)
                {
                    System.out.println("First non-repeating element is: "+A[i]);
                    return;
                }
                if (j != i && A[i] == A[j])
                {
                    break;
                }
            }
        }
        System.out.println("All the elements are repeating.");
    }
  public static void main(String[] args) {
    int A[]={2, 1, 2, 1};
    firstNonRepeatingElement(A);
  }
}
