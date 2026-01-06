package String;

import java.util.Scanner;

public class updateevenpos 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        int i,l;
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(i%2==0)
            s=s.substring(0, i)+'a'+s.substring(i+1);
        }
        System.out.println("Updated string:"+s);
    }
    
}
