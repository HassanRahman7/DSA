package String;

import java.util.Scanner;

//leetcode 3163
public class compression3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String word,s="";
        System.out.println("Enter a word:");
        word=sc.next();
        word=word+" ";
        int i,j,c=1;
        i=0;
        j=i+1;
        char ch;
        while(i<word.length()&&j<word.length())
        {
            ch=word.charAt(i);
            if(ch==word.charAt(j))
            {
                c++;
                j++;
                if(c==9)
                {
                    s=s+c+ch;
                    c=0;
                }
            }
            else
            {
                if(c==0)
                {
                    i=j;
                    j++;
                    c=1;
                    continue;
                }
                else
                s=s+c+ch;
                c=1;
                i=j;
                j++;
            }
        }
        System.out.println(s);
        
    }
}
