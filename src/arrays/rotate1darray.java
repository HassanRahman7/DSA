package arrays;
import java.util.Scanner;
public class rotate1darray 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int copy,p,c=0,k,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the number of times you want to rotate the array:");
        k=sc.nextInt();
        copy=k;
        if(k<0)
        {
            System.out.println("Array can not be rotated minus k times.");
            System.exit(0);
        }
        while(k>n)
        k=k-n;
        for(i=0;i<copy;i++)
        {
            brr[i]=arr[n-k];
            k--;
        }
        p=i;
        for(i=p;i<n;i++)
        {
            brr[i]=arr[c];
            c++;
        }
        System.out.println("Updated array:");
        for(i=0;i<n;i++)
        System.out.print(brr[i]+" ");
    }
}