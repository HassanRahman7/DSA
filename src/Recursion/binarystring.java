package Recursion;

public class binarystring 
{
    public static void gen(String s,int n) 
    {
        if(s.length()==n)
        {
            System.out.println(s);
            return;
        }
        if(s.length()==0||s.charAt(s.length()-1)=='0')
        {
            gen(s+0, n);
            gen(s+1,n);
        }
        else
        gen(s+0,n);
        
    }
    public static void main(String[] args) 
    {
        int n=3;
        
        //System.out.println(s.charAt(0));
        gen("",n);

        
    }
    
}
