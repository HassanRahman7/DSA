package arrays;
import java.util.Scanner;
public class twosum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,x,i,n,c=0;
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("The following are the doublets:");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
    
}
