package TWODARRAY;

import java.util.Scanner;

public class waveform 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(j=n-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    
}
