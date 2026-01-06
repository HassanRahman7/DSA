package Recursion;



public class print1ton 
{
    public static void print(int a,int n) 
    {
        if(a==n+1)
        return;
        else
        {
            System.out.println(a);
            print(a+1, n);
        }
    }
    public static void main(String[] args) 
    {
        int n=5;
        print(1, n);
        
    }
    
}
