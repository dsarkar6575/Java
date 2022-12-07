class Printdec{
    
    static void decrise(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
       
       
        decrise(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        decrise(n);
    }
}