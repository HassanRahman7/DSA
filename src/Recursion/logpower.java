package Recursion;

public class logpower 
{
    public static int pow(int a,int b) 
    {//O(log n)
        int ans;
        if(b==0)
        return 1;
        else if(b%2==0)
        {
            ans=pow(a, b/2);
            return ans*ans;
        }
        else
        {
            ans=pow(a,b/2);
            ans=ans*ans*a;
            return ans;
        }
    }
    public static void main(String[] args) 
    {
        int a=2,b=5;
        System.out.println(pow(a, b));
        
    }
    
}
