package TWODARRAY;

import java.util.Scanner;

public class waveform3 
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
        System.out.println("Enter the elements in the arrays:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<n;j++)
        {
            if(j%2==0)
            {
                for(i=0;i<m;i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(i=m-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

        
    }
    
}
