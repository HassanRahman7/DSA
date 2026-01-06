package arrays;
import java.util.Scanner;
public class linearsearch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,x,b=0,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[]=new int[n];
        for (i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to be searched:");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x==arr[i])
            {
               b++;
               System.out.println("Element found at position :"+(i+1));
               break;
            }
        }
        if(b==0)
        System.out.println("Element not found:");
    }
}
