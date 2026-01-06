package String;

public class Count_the_number_of_vowel_string_in_range
{
    public static boolean check_con(String s)
    {
        if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')
        {
            if(s.charAt(s.length()-1)=='a'||s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u')
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public static int vowelStrings(String[] words, int left, int right)
    {
        int ans=0,i=left;
        for(i=left;i<=right;i++)
        {
            if(check_con(words[i])==true)
                ans++;
            else
                continue;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String s[]={"are","amy","u"};
        System.out.println(vowelStrings(s,0,2));
    }
}
