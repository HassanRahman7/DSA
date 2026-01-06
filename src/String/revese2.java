package String;

import java.util.Scanner;

//leetcode 541
public class revese2 
{
    public static String reverse(String s) 
    {
        String s2="";
        int i,j=s.length()-1;
        for(i=0;i<s.length();i++)
        {
            s2=s2+s.charAt(j);
            j--;
        }
        return s2;

        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,s2="",s3="";
        System.out.println("Enter a string:");
        s="hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
        System.out.println(s.length());
    
        int j=0,i=0,k,c=0;
        System.out.println("Enter the value of k=");
        k=sc.nextInt();
        j=k;
        if(k>=s.length())
        {
            s2=s2+reverse(s);
            s2=s2.trim();
            System.out.println(s2);
        }
        else
        {
            while(i<s.length()&&j<s.length())
            {
                if((s.length()-j)<k)
                {
                    s2=s2.trim();
                    s2=s2+reverse(s.substring(i));
                    for(i=0;i<s2.length();i++)
                    {
                        if(s2.charAt(i)!=' ')
                        s3=s3+s2.charAt(i);
                    }
                    System.out.println(s3);
                    break;
                }
                s2=s2+reverse(s.substring(i, j));//reverse of first k characters has been added.
                i=j;
                j=j+k;
                if(j>s.length())
                break;
                s2=s2+s.substring(i,j);
                i=j;
                j=j+k;
            }
            s2=s2.trim();
            if(s.length()==s2.length())
            {
                System.out.println(s2);
                System.exit(0);
            }
            else
            s2=s2+s.substring(i);
    }
    
}
}
