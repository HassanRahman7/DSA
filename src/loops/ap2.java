package loops;
import java.util.Scanner;
public class ap2
{
    public static void main(String[] args) 
    {
        int i,n;
        System.out.println("Enter a number.");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("The Ap series is:");
        for(i=4;i<=n;i=i+3)
        System.out.println(i);
    }
}
