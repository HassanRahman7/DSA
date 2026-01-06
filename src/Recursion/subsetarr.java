package Recursion;

public class subsetarr 
{
    public static void printsub(int i,String s,String ans) 
    {
        if(i==s.length())
        {
            System.out.println(ans);
            return;
        }        
        printsub(i+1, s, ans+s.charAt(i));//take
        printsub(i+1, s, ans);//do not take.
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3};
        String s="";
        int i;
        for(i=0;i<arr.length;i++)
            s=s+arr[i];
        printsub(0,s,"");
        
    }
    
}
