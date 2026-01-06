package arrays;
//THIS IS FOR SORTING 3 COLOURS
import java.util.Scanner;

public class DutchFlagalgorithm 
{
    public static void swap(int []arr,int mid,int low) 
    {
        int temp=arr[mid];
        arr[mid]=arr[low];
        arr[low]=temp;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int mid=0,i,n,low=0,high;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else
            {
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}    