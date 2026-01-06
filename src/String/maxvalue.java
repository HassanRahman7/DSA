package String;

import java.util.Scanner;


public class maxvalue 
{
    public static String purify(String s1)
    {
        int i;
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!='0')
            return s1.substring(i);
        }
        return s1;
    } 
    public static String max(String s1,String s2) 
    {
        String s,p;
        s=purify(s1);
        p=purify(s2);
        if(s.length()>p.length())
        return s1;
        if(s.length()<p.length())
        return s2;
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=p.charAt(i))
            {
                if(s.charAt(i)>p.charAt(i))
                return s1;
                if(s.charAt(i)<p.charAt(i))
                return s2;      
            }
        }
        if(s1.length()>=s2.length())
        return s1;
        else
        return s2;


        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String maxS;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter numbers into the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.next();
        maxS=arr[0];
        for(i=1;i<n;i++)
        maxS=max(maxS,arr[i]);
        System.out.println("max="+maxS);

    }
    
}
