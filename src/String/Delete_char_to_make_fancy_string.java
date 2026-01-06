package String;

public class Delete_char_to_make_fancy_string
{
    public static String makeFancyString(String s)
    {
        if(s.length()<3)
            return s;
        int i=2;
        char ch1;
        char ch2;
        char ch3;
        StringBuilder ans=new StringBuilder("");
        while(i!=s.length())
        {
            ch1=s.charAt(i-2);
            ch2=s.charAt(i-1);
            ch3=s.charAt(i);
            if(ch1==ch2 && ch2==ch3)
            {
                i++;
                continue;
            }
            else
                ans.append(""+ch1);
            i++;
        }
        ans.append(""+s.charAt(s.length()-2)+s.charAt(s.length()-1));
        return ans.toString();
    }

    public static void main(String[] args)
    {
        String  s = "aab";
        System.out.println(s);
    }
}
