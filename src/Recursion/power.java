package Recursion;

public class power 
{
    public static int pow(int a,int b) 
    {
        if(b==0)
        return 1;
        else
        return a*pow(a, b-1);
    }
    public static void main(String[] args) 
    {
        int a=3,b=3;
        System.out.println("Answer="+pow(a, b));
        
    }
    
}
