package Hashmaps;
import java.util.HashSet;
public class dog_bak 
{
    public static int barks(String s)
    {
        int i=0,c=0;
        // char ch;
        s=s+".";
        HashSet<Integer> set=new HashSet<>();
        while(i!=s.length())
        {
            if(s.charAt(i)=='B')
            c++;
            else if(s.charAt(i)=='.')
            {
                if(c!=0)
                set.add(c);
                c=0;
            }
            i++;
        }
        return set.size();
    }
    public static void main(String[] args) 
    {
        String s="B...B...BB...B....BBBB";
        System.out.println(barks(s));
    }
}
