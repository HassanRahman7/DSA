package stringsassignment;

import java.util.Scanner;

//Q1. Input a string of size n and Update all the odd positions in the string to character ‘#’. Consider 0-based
//indexing.
public class updateodd 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,s2="";
        System.out.println("Enter a string:");
        s=sc.nextLine();
        char c[]=s.toCharArray();
        int i,n;
        n=s.length();
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            c[i]='#';
            s2=s2+c[i];
        }
        System.out.println(s2);


        
    }
    
}
