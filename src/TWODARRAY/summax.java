package TWODARRAY;

import java.util.Scanner;

public class summax 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int min,i,j,s=0,max,m,n,p=1;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the 2d array:");
        int arr[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                s=s+arr[i][j];
                p=p*arr[i][j];
            }
        }
        System.out.println("The sum of all the elements present in the array is:"+s);
        max=arr[0][0];
        min=arr[0][0];
        for(i=0;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                if(arr[i][j]>max)
                max=arr[i][j];
                else if(arr[i][j]<min)
                min=arr[i][j];
            }
        }
        System.out.println("The max value present in the array is="+max);
        System.out.println("The min value present in the array is :"+min);
        System.out.println("Product of all the elements present in the array is="+p);



        
    }
    
}
