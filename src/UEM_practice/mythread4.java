package UEM_practice;

public class mythread4 extends Thread
{
    public void run()
    {
        System.out.println("Thread is running.");
        System.out.println("Thread might go to sleep.");
        try
        {
            Thread.sleep(10003);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Thread is back again with a bang.");
    }
}
