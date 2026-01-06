package String;

import java.util.Scanner;

public class countdigit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        String s="";
        s=s+n;
        System.out.println("Number of digits:"+(s.length()));
        
    }
    
}
