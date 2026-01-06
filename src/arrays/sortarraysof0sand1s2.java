package arrays;
//GOOD WAY OF SOLVING.
import java.util.Scanner;
//USED 2 POINTER WAY
public class sortarraysof0sand1s2 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int i,n,j;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        i=0;
        j=n-1;
        while(j>i)
        {
            if(arr[i]==0)
            i++;
            if(arr[j]==1)
            j--;
            if(i>j)
            break;
            if(arr[i]>arr[j])
            {
                arr[i]=0;
                arr[j]=1;
            }
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");

        
    }
    
}
