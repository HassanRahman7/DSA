package TwoDarrayassignment;

import java.util.Scanner;

public class rotate90acw 
{
    public static void rotate(int arr[][]) 
    {
        int i,j,n,c=0,temp;
        n=arr.length;
        for(i=0;i<n;i++)
        {
            for(j=c;j<n;j++)
            {
                if(i==j)
                continue;
                else
                {
                    temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            if(j==n)
            c++;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n/2;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the number of row in the square matrix:");
        n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        rotate(arr);
        System.out.println("Displaying the modified array:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
    
}
