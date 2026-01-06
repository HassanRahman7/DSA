package UEM_practice;

public class OddNumberPrinter extends Thread 
{
    public void run()
    {
        if(RandomNumbergenerator.number%2!=0)
        {
            System.out.println("Printing Odd numbers:");
            int i;
            for(i=3;i<=RandomNumbergenerator.number;i=i+2)
            System.out.print(i+" ");
            System.out.println();
        }
    }   
}
