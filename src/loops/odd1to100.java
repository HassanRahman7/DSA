package loops;

public class odd1to100 
{
    public static void main(String[] args) 
    {
        int i;
        System.out.println("Odd numbers from 1 to 100");
        for(i=1;i<=100;i++)
        {
            if(i%2==0)
            continue;
            else
            System.out.println(i);
        }   
    }    
}
