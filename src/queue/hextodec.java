package queue;

import java.util.Scanner;

public class hextodec 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a hexadecimal number.");
        String hex;
        hex=sc.nextLine();
        int dec;
        try
        {
            // int dec;
            dec=Integer.parseInt(hex,16);
            System.out.println("Decimal equivalent:"+dec);
        }
        catch(Exception e)
        {
            System.out.println("Invalid hexadecimal number.");
            System.out.println(e);
        }
        System.out.println("Enter a decimal number:");
        dec=sc.nextInt();
        String octal;
        octal=Integer.toOctalString(dec);
        System.out.println("Octal equivalent:"+octal);
    }
}
