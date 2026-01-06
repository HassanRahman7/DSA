package loops;
import java.util.Scanner;
public class sumofdigits 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int d,s=0,n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            n=n/10;
            s=s+d;
        }
        System.out.println("The Sum of digits="+s);
    }
}
