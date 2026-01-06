package leetcode;

// 8. String to Integer (atoi)
// https://leetcode.com/problems/string-to-integer-atoi/description/
public class Stringtointegeratoi 
{
    public static boolean checkInteger(char ch)
    {
        if((int)ch>=48&&(int)ch<=57)
        return true;
        else
        return false;
    }
    public static int myAtoi(String s) 
    {
        s=s.trim();
        int i=0;
        // System.out.printf("%s",s);
        if(s.length()==0)
        return 0;
        boolean isneg;
        if(s.charAt(0)=='-')
        {
            i++;
            isneg=true;
        }
        else 
        {
            i=0;
            isneg=false;
        }
        int dig,res=0;
        if(s.charAt(0)=='+')
        i=1;
        while(i!=s.length()&&checkInteger(s.charAt(i))==true)
        {
            dig=s.charAt(i)-'0';
            if((res>Integer.MAX_VALUE/10)||(res==Integer.MAX_VALUE/10 && dig>Integer.MAX_VALUE%10))
            {
                if(isneg==true)
                return Integer.MIN_VALUE;
                else
                return Integer.MAX_VALUE;
            }
            res=res*10+dig;
            i++;
        }
        if(isneg==true)
        return -1*res;
        else
        return res;
        
    }
    public static void main(String[] args) 
    {
        String s="1337c0d3";
        System.out.println(myAtoi(s));// 1337 will be the answer.
        
    }    
}
