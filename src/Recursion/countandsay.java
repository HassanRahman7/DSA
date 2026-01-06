package Recursion;

import java.util.Scanner;

public class countandsay 
{
    public static String cas(int n) 
    {
        if(n==1)
        return "1";
        String s=cas(n-1);
        s=s+" ";
        String ans="";
        int i=0,j=i+1,c=1;
        while(i<s.length()&&j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                c++;
                j++;
                continue;
            }
            else
            {
                ans=ans+c+s.charAt(i);
                c=1;
                i=j;
                j=j+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(cas(n));
        /*s=sc.next();
        s=s+" ";
        int c=1,i=0,j=i+1;
        while (i<s.length()&&j<s.length()) 
        {
            if(s.charAt(i)==s.charAt(j))
            {
                c++;
                j++;
                continue;
            }
            else
            {
                ans=ans+c+s.charAt(i);
                c=1;
                i=j;
                j=j+1;
            }
            
        }
        System.out.println(ans);
        */
    }
    
}
