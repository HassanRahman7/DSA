package leetcode;

public class leetcode1910 
{
    public static String removeOccurrences(String s, String part) 
    {
        StringBuilder sb=new StringBuilder();
        // int n=s.length();
        // int m=part.length();
        int i=0;
        for(i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            if(sb.length()>=part.length())
            {
                String sub=sb.substring(sb.length()-part.length());
                if(sub.equals(part)==true)
                    sb.setLength(sb.length()-part.length());
            }
        }
        return sb.toString();   
    }
    public static void main(String[] args) 
    {
        String s="daabcbaabcbc",part="abc";
        System.out.println(removeOccurrences(s,part));
        
    }
    
}
