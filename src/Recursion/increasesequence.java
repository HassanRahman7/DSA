package Recursion;
//print all increasing sequences of length k from first n natural numbers.
public class increasesequence 
{
    public static void print(int i, int k ,int n,String ans) 
    {
        if(i==n||ans.length()==k)
        {
            if(ans.length()==k)
            System.out.println(ans);
            return;
        }
        print(i+1, k, n, ans);
        ans=ans+i;
        print(i+1, k, n, ans);
    }
    public static void main(String[] args) 
    {
        int n=6,k=4;
        print(1,k,n+1,"");
    }
    
}
