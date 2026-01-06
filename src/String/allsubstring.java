package String;

import java.util.Scanner;

public class allsubstring 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        int j,i,l;
        l=s.length();
        System.out.println("All the substrings of the inputed string are:");
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l+1;j++)
            {
                System.out.println(s.substring(i, j));
            }
        }


        
    }
    
}
