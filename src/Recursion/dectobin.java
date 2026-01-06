package Recursion;
public class dectobin 
{
    static String ans="";
    public static void con(int n) 
    {
        if(n==1)
            ans=1+ans;
        else if(n%2==1)
        {
            ans="1"+ans;
            con(n/2);
        }
        else
        {
            ans="0"+ans;
            con(n/2); 
        }
    }
    public static void main(String[] args) 
    {
        int n=7;
        con(n);
        System.out.println(ans); 
    }    
}
