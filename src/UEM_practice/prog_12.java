package UEM_practice;

public class prog_12 
{
    public static void main(String[] args) 
    {
        RandomNumbergenerator gen=new RandomNumbergenerator();
        EvenNumberPrinter evenprint=new EvenNumberPrinter();
        OddNumberPrinter oddprint=new OddNumberPrinter();
        gen.start();
        try
        {
            gen.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        evenprint.start();
        oddprint.start();
    }
}
