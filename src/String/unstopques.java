package String;

import java.util.Scanner;

public class unstopques
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String S;
        System.out.println("Enter a string:");
        S=sc.nextLine();
        int i=0,Sc=0;
        char ch;
        String ans="";
        while(i!=S.length())
        {
            ch=S.charAt(i);
            if(ch==' ')
                ans=ans+ch;
            else if((int)ch>=97 && (int)ch<=122)
            {
                if(Sc==0)
                    ans=ans+ch;
                else
                    Sc--;
            }
            else
                Sc++;
            i++;
        }
        System.out.println(ans);
    }
}
