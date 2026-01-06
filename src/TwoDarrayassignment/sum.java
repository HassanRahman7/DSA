package TwoDarrayassignment;

import java.util.Scanner;

public class sum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int s=0,m,n,i,j,l1,r1,l2,r2,l3,l4,r3,r4;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value of l1:");
        l1=sc.nextInt();
        System.out.println("Enter the value of r1:");
        r1=sc.nextInt();
        System.out.println("Enter the value of l2:");
        l2=sc.nextInt();
        System.out.println("Enter the value of r2:");
        r2=sc.nextInt();
        l3=Math.max(l1, l2);
        l4=Math.min(l1, l2);
        r3=Math.max(r1, r2);
        r4=Math.min(r1, r2);
        for(i=l4;i<=l3;i++)
        {
            for(j=r4;j<=r3;j++)
            {
                s=s+arr[i][j];
            }
        }
        System.out.println("Sum="+s);
        
    }
    
}
