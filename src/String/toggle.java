package String;

import java.util.Scanner;


public class toggle 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter a string:");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for(i=0;i<sb.length();i++)
        {
            if(Character.isLowerCase(sb.charAt(i)))
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            else
            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
        }
        System.out.println("Updated string:"+sb);
    }
    
}
