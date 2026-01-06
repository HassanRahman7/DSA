package UEM_practice;
import java.util.Random;
public class RandomNumbergenerator extends Thread 
{
    static int number;
    public void run()
    {
        Random rand=new Random();
        number=rand.nextInt(100)+24; // generated number hmesha 1 sai zyada hoga.
        System.out.println("Generated Number:"+number);
    }
}
