package loops;
import java.util.*;
public class Composite 
{
    public static void main(String[] args) 
    {
        int c=0,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
                break;
            }
        }
        if(c==1)
        System.out.println("The inputed number is a composite number.");
        else
        System.out.println("Number is not composote number.");
    }
}
