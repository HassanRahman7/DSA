package Recursion;

public class subset 
{
    public static void sub(int i,String s,String ans) 
    {
        if(i==s.length())
        {
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(i);
        sub(i+1, s, ans+ch);//take
        sub(i+1, s, ans);//dont take the extra character.
        
    }
    public static void main(String[] args) 
    {
        String s="abc";
        sub(0, s, "");
        
    }
    
}
