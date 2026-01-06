package String;

import java.util.Scanner;
//leetcode 541
public class reverse21 
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
        System.out.println("Enter a string:");
        String s,s2="";
        s=sc.next();
        s=s+" ";
        int k;
        System.out.println("Enter the value of k");
        k=sc.nextInt();
        int i=0,j,n;
        n=s.length();
        j=k;
        if(k>s.length())
        {
            s2=s2+reverse(s);
            System.out.println(s2);
            System.exit(0);
        }
        while(i<s.length()&&j<s.length())
        {
            if(n<2*k||n>=k)
            {
                s2=s2+reverse(s.substring(i, j));
                n=n-s.substring(i,j).length();
                i=j;
                j=j+k;
                if(j>s.length())
                break;
                s2=s2+s.substring(i,j);
                i=j;
                j=j+k;
                if(j>s.length())
                break;
                n=n-s.substring(i, j).length();
            }
            if(k>n)
            {
                s2=s2+reverse(s.substring(i, j));
                System.out.println(s2);
                System.exit(0);
            }
        }
        System.out.println(s2);
    }
}
        
 
    

