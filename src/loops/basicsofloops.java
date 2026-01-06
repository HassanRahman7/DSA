package loops;
import java.util.Scanner;
public class basicsofloops 
{
    public static void main(String[] args) 
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            System.out.println("Hello World!");
    }
    
}
