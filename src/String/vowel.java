package String;

import java.util.Scanner;

public class vowel 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,l,c=0;
        char ch;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            c++;
        }
        System.out.println("The number of vowels present in the string is="+c);
        
    }
    
}
