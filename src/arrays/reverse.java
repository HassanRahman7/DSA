package arrays;
import java.util.Scanner;
public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c,a=0,b,i,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
           arr[i]=sc.nextInt();
        System.out.println("Printing the array");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        b=n-1;
        for(i=0;i<n/2;i++)
        {
            c=arr[b];
            arr[b]=arr[a];
            arr[a]=c;
            a++;
            b--;
        }
        /* ANOTHER WAY OF SOLVING THIS:
         * while(a<=b)
         * {
         *      swap(arr[a],arr[b]);
         *      a++;
         *      b--;
         * }
         */
        System.out.println("Updated array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }    
}
