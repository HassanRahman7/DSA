package arrays;
import java.util.Scanner;
public class maxelement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int max,i,n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        max=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("The max element in the array:"+max);
        
    }
    
}
