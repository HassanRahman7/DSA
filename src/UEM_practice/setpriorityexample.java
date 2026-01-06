package UEM_practice;

public class setpriorityexample 
{
    public static void main(String[] args) 
    {
        mythread2 ob=new mythread2();
        ob.setPriority(1);
        mythread2 ob2=new mythread2();
        ob2.setPriority(2);
        ob2.start();
        ob.start();
    }
}
