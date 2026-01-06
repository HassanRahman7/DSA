package UEM_practice;

public class Runnableexample 
{
    public static void main(String[] args) 
    {
        mythreadrunnable1 tr1=new mythreadrunnable1();
        Thread th1=new Thread(tr1);
        th1.start();
        mythreadrunnable2 tr2=new mythreadrunnable2();
        Thread th2=new Thread(tr2);
        th2.start();
    }
}
