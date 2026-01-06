package arrays;
// MERGE 2 SORTED ARRAY INTO ONE SORTED ARRAY WITHOUT USING ANY SORTING TECHNIQUE.
import java.util.Scanner;
//3 Pointer approach.
public class merge 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c,j,k,i,n1,n2;
        System.out.println("Enter the size of first array:");
        n1=sc.nextInt();
        int arr[]=new int[n1];
        System.out.println("Enter the elements in sorted order:");
        for(i=0;i<n1;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the size of second array:");
        n2=sc.nextInt();
        int brr[]=new int[n2];
        System.out.println("Enter the elements in the second array:");
        for(i=0;i<n2;i++)
        brr[i]=sc.nextInt();
        int crr[]=new int[n1+n2];
        i=j=k=0;
        while(i<n1||j<n2)
        {
            if(i>=n1||j>=n2)
            break;
            else if(arr[i]<=brr[j])
            {
                crr[k]=arr[i];
                i++;
                k++;
            }
            else 
            {
                crr[k]=brr[j];
                j++;
                k++;
            }
        }
        if(i==n1)
        {
            for(c=j;c<n2;c++)
            {
                crr[k]=brr[c];
                k++;
            }
        }
        else if(j==n2)
        {
            for(c=i;c<n1;c++)
            {
                crr[k]=brr[c];
                k++;
            }
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n1+n2;i++)
        System.out.print(crr[i]+" ");
    
        
    }
    
}
