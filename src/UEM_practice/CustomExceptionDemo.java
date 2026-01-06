package UEM_practice;

import java.util.Scanner;

public class CustomExceptionDemo 
{
    static void validateAge(int age) throws ArithmeticException
    {
        if(age<18)
        throw new ArithmeticException("Access Denied. You must be 18 or Older.");
        else
        System.out.println("Access granted- You are old enough");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter your age:");
            int age;
            age=sc.nextInt();
            validateAge(age);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught:"+e.getMessage());
        }
        finally
        {
            System.out.println("Validation complete.Thank You");
        }
    }
}
