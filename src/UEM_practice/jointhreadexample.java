package UEM_practice;

public class jointhreadexample 
{
    public static void main(String[] args) 
    {
        mythread2 ob=new mythread2();
        mythread2 ob2=new mythread2();
        ob.start();
        try {
            ob.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        ob2.start();
        try {
            ob2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        ob.run(); 
        mythread2 ob3=new mythread2();
        ob3.start();
        while (ob3.isAlive()) 
        {
            System.out.println("Thread is still alive...");
            try 
            {
                Thread.sleep(500); // Wait for a while before checking again
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        if(ob3.isAlive()==true)
        {
            System.out.println("Abhi bhi zinda hai.");
        }
        else
        System.out.println("thread is over now.");
    }
}
