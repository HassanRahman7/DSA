package String;

public class Valid_word
{
    public static boolean isValid(String word)
    {
        boolean dig=false;
        boolean let=false;
        boolean vow=false;
        boolean con=false;
        boolean spe=false;
        if(word.length()>=3)
        {
            int i=0;
            char ch;
            while(i!=word.length())
            {
                ch=word.charAt(i++);
                if((int)ch>=48 && (int)ch<=57)
                    dig=true;
                else if(((int)ch>=65 && (int) ch<=90)||((int)ch>=97 && (int)ch<=122))
                {
                    char ch2=Character.toUpperCase(ch);
                    if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')
                        vow=true;
                    else
                        con=true;
                }
                else if(ch=='@'||ch=='#'|| ch=='$')
                    spe=true;
            }
        }
        if(vow==true&&con==true&&spe==false)
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        String word = "a3$e";
        System.out.println(isValid(word));

    }
}
