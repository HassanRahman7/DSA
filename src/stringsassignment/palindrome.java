package stringsassignment;

import java.util.Scanner;

public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        int i,j=s.length()-1,k=0;
        for(i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                j--;
                continue;
            }
            else
            {
                k++;
                System.out.println("Not palindrome");
                break;
            }
        }
        if(k==0)
        System.out.println("Palindrome");
        
    }
    
}
