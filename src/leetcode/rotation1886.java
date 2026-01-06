package leetcode;

import java.util.Scanner;

public class rotation1886 
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
    public static boolean equal(int arr[][],int brr[][]) 
    {
        int l=0,i,j,n;
        n=arr.length;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==brr[i][j])
                continue;
                else
                {
                    l++;
                    break;
                }
            }
            if(l!=0)
            break;
        }
        if(l==0)
        return true;
        else 
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c,i,j,m,n,k=0;
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
        int brr[][]=new int[m][n];
        System.out.println("Enter the target matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        for(c=1;c<=4;c++)
        {
            rotate(arr);
            if(equal(arr, brr)==true)
            {
                System.out.println("Identical");
                k++;
                break;
            }
            else
            continue;
        }
        if(k==0)
        System.out.println("Non identical.");
            

            


        
    }
    
}
