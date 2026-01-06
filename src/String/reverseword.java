package String;

import java.util.Scanner;
// reverse each word in a sentence.
public class reverseword 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence.");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        sb.append(" ");
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        int i,n=0;
        for(i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==' ')
            {
                sb2.append(sb.substring(n,i)).reverse().append(" ");
                sb3.append(sb2);
                sb2.delete(0,sb2.length());
                n=i+1;

            }
        }
        System.out.println("Updated array:"+sb3);
        
        
        
    }  
}
