package loops;
import java.util.Scanner;
public class gp1 
{
    public static void main(String[] args) 
    {
        int n;
        double i;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0.0;i<=n;i++)
        System.out.println((int)Math.pow(2.0,i));
    }
}
