package UEM_practice;

import java.util.Scanner;

public class prog_4 
{
    public static void main(String[] args) throws NoMatchException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name of a country:");
        String c;
        c=sc.nextLine();
        try
        {
            boolean flag;
            if(c.equalsIgnoreCase("India")==true)
            flag=true;
            else
            flag=false;
            if(flag==false)
            throw new NoMatchException("Country name not India");
        }
        catch(NoMatchException e)
        {
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally
        {
            System.out.println("kaam khatam paisa hazam.");
        }
    }
}
