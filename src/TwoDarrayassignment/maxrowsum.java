package TwoDarrayassignment;

import java.util.Scanner;

public class maxrowsum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int max=0,s=0,i,j,m,n;
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
        int sum[]=new int[m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                s=s+arr[i][j];
            }
            sum[i]=s;
            s=0;
        }
        for(i=0;i<m;i++)
        {
            if(sum[i]>max)
            max=sum[i];
        }
        for(i=0;i<m;i++)
        {
            if(sum[i]==max)
            {
                System.out.println("The row with the maximum sum is ="+(i+1));
                break;
            }
        }
    
    }
}
