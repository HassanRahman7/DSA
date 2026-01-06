package String;

import java.util.Scanner;

public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int i,j;
        char ch;
        j=sb.length()-1;
        for(i=0;i<sb.length()/2;i++)
        {
            ch=sb.charAt(j);
            sb.setCharAt(j,sb.charAt(i));
            sb.setCharAt(i,ch);
            j--;
        }
        System.out.println("Reversed String:"+sb);
        
    }
    
}
