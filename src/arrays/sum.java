package arrays;
import java.util.Scanner;
public class sum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,sum=0,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("The sum of all the elements in the array:"+sum);
        

        
    }
    
}
