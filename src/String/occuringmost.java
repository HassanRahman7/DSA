package String;

import java.util.Scanner;

public class occuringmost 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        StringBuilder sb=new StringBuilder(sc.next());
        int arr[]=new int[26];
        int i,max;
        char ch;
        for(i=0;i<sb.length();i++)
        {
            ch=sb.charAt(i);
            arr[(int)ch-97]++;
        }
        max=-1;
        for(i=0;i<26;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("The characters which are appearing the most are as follows:");
        for(i=0;i<26;i++)
        {
            if(arr[i]==max)
                System.out.println((char)(i+97));
        }
    }
}