package loops;
import java.util.Scanner;
public class countdigit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c=0,n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            n=n/10;
            c++;
        }
        System.out.println("The number of digits="+c);
    }
}
