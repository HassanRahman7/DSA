package Hack_with_infy_practise;

public class prob2 
{
    public static String solve(int a,int b,int c,int d,int e)
    {
        if((a+b+c)==(d+e))
            return "YES";
        else
            return "NO";
    }
    public static void main(String[] args) 
    {
        System.out.println(solve(2,4,2,6,2));
    }
    
}
