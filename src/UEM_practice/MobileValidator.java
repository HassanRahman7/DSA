package UEM_practice;

import java.util.Scanner;

public class MobileValidator 
{
    static void validateMobile(String mobile) throws InvalidMobileNumberException
    {
        if(mobile.length()!=10)
            throw new InvalidMobileNumberException("Invalid Mobile Number. It must contain 10 digits only.");
        else
        {
            int i;
            char ch;
            boolean flag=true;
            for(i=0;i<10;i++)
            {
                ch=mobile.charAt(i);
                if(Character.isDigit(ch)==true)
                continue;
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag==false)
            throw new InvalidMobileNumberException("The mobile number should only contain digits.");
            else
            System.out.println("Mobile number is valid.");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mobile number:");
        String input;
        input=sc.nextLine();
        try
        {
            validateMobile(input);
        }
        catch(InvalidMobileNumberException e)
        {
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally
        {
            System.out.println("Validation process completed.");
        }        
    }
}