package Recursion;

public class permutation 
{
    public static void permu(String s2, String s) 
    {
        if(s.length()==0)
        {
            System.out.println(s2);
            return;
        }
        int i;
        for(i=0;i<s.length();i++)
            permu(s2+s.charAt(i), s.substring(0,i)+s.substring(i+1, s.length()));
        
    }
    public static void main(String[] args) 
    {
        String s="abc";
        //System.out.println(s.substring(0, 1)+(s.substring(2, s.length())));
        permu("",s);
          
    }
}
