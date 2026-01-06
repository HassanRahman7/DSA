package loops;
import java.util.Scanner;
public class ap1 
{
    public static void main(String[] args) 
    {
        int i,n;
        System.out.println("Enter a number.");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("The Ap series is:");
        for(i=1;i<=n;i=i+2)
        System.out.println(i);
    }
}
