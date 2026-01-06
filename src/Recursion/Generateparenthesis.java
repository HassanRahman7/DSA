package Recursion;

public class Generateparenthesis 
{
    public static void solve(int n,int o,int c,String str) 
    {
        if(str.length()==2*n)
        {
            System.out.println(str+"    "+o+"   "+n);
            return;
        }
        if(str.length()==0)
        {
            str=str+'(';
            o++;
        }
        if(o<n)
            solve(n, o+1, c, str+'(');
        /*if(str.charAt(str.length()-1)=='('&&o<n)
        {
            solve(n, o+1, c, str+'(');
            solve(n, o, c+1, str+')');
        }*/
        //if(str.charAt(str.length()-1)==')'&&o<n)
         //   solve(n, o+1, c, str+'(');
        if(c<o)
        solve(n, o, c+1, str+')');
    }
    public static void main(String[] args) 
    {
        int n=3;
        int o=0,c=0;
        solve(n,o,c,"");
        
    }
    
}
