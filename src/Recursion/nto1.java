package Recursion;

public class nto1 
{
    public static void print(int n) 
    {
        if(n==0)
        return;
        System.out.println(n);
        print(n-1);
        
    }
    public static void main(String[] args) 
    {
        int n=7;
        print(n);
        
    }   
    
}
