package UEM_practice;

public class Mythread extends Thread 
{
    Counter counter;
    public Mythread(Counter counter)
    {
        this.counter=counter;
    }
    @Override
    public void run()
    {
        int i;
        for(i=0;i<1000;i++)
        counter.increment();
    }
}