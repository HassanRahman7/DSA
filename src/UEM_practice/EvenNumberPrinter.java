package UEM_practice;

public class EvenNumberPrinter extends Thread 
{
    public void run()
    {
        if(RandomNumbergenerator.number%2==0)
        {
            System.out.println("Even Numbers:");
            int i;
            for(i=2;i<=RandomNumbergenerator.number;i=i+2)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
