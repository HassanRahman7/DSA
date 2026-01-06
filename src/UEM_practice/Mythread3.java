package UEM_practice;

public class Mythread3 extends Thread
{
    public void run()
    {
        System.out.println("Normal run kar rhe hain bhai.");
    }
    public void run(String name)
    {
        System.out.println(name+"is running. Yeh hai overloading ka kamaal beta.");
    }
}
