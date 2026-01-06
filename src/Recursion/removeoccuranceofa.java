package Recursion;

public class removeoccuranceofa 
{
    static String ans="";
    public static void print(String s,int n) 
    {
        if(n==s.length())
        return;
        else
        {
            if(s.charAt(n)=='a')
            print(s, n+1);
            else
            {
                ans=ans+s.charAt(n++);
                print(s, n);
            }
        }
    }
    public static void main(String[] args) 
    {
        String s="Cristiano Ronaldo Dos Santos Aviero";
        print(s, 0);
        System.out.println(ans);
    }
    
}
