package UEM_practice;

import java.util.Scanner;

public class bankaccount 
{
    double balance;
    bankaccount(double initializeBalance)
    {
        balance=initializeBalance;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited amount:Rs"+amount);
    }
    public void withdraw(double amount) throws Insufficientbalance
    {
        boolean flag=true;
        if(amount>balance)
        flag=false;
        if(flag==false)
        throw new Insufficientbalance("Jitna paisa nhi usse zyada nikal lega kya?");
        else
        {
            balance=balance-amount;
            System.out.println("Withdrawn:"+amount);
        }
    }
    double getbalance()
    {
        return balance;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        bankaccount meraacc=new bankaccount(1232);
        System.out.println("Current balance:"+meraacc.getbalance());
        try
        {
            System.out.println("Enter the amount to deposit");
            double depo;
            depo=sc.nextDouble();
            meraacc.deposit(depo);
            System.out.println("Enter amount to withdraw.");
            double withd;
            withd=sc.nextDouble();
            meraacc.withdraw(withd);
        }
        catch (Insufficientbalance e)
        {
            System.out.println("Exception aa gaya: "+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Kuch dusra garbar hogaya:"+e.getMessage());
        }
        finally
        {
            System.out.println("Final Balance:"+meraacc.getbalance());
            System.out.println("Jazakallah khair.");
        }
    }
}
