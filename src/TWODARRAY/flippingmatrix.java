package TWODARRAY;

import java.util.Scanner;

public class flippingmatrix 
{
    public static void flipr(int arr[][],int r,int n) 
    {
        int j;
        for(j=0;j<n;j++)
        {
            if(arr[r][j]==0)
            arr[r][j]=1;
            else
            arr[r][j]=0;
        }
    }
    public static void flipc(int arr[][],int c,int m ) 
    {
        int i;
        for(i=0;i<m;i++)
        {
            if(arr[i][c]==0)
            arr[i][c]=1;
            else
            arr[i][c]=0;
        }
    }
    public static int getDecimal(int binary)
    {  
        int decimal = 0;  
        int n = 0;  
        while(true)
        {  
          if(binary == 0)
            break;   
        else 
        {  
            int temp = binary%10;  
            decimal += temp*Math.pow(2, n);  
            binary = binary/10;  
            n++;  
        }  
        }  
        return decimal;
    }
    public static int sum(int arr[][],int m,int n) 
    {
        
        int s=0,i,j,x=0,c;
        c=n;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                x=x+arr[i][j]*(int)Math.pow(10.0,c);
                c--;
            }
            x=x/10;
            s=s+getDecimal(x);
            c=n;
            x=0;
        }
        return s;
    }
    public static void display(int arr[][],int m,int n) 
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static int countzeroes(int arr[][],int c,int m) 
    {
        int i,co=0;
        for(i=0;i<m;i++)
        {
            if(arr[i][c]==0)
            co++;
        }
        return co;
    }
    public static int countone(int arr[][],int c,int m) 
    {
        int i,co=0;
        for(i=0;i<m;i++)
        {
            if(arr[i][c]==1)
            co++;
        }
        return co;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int su=0,m,n,i,j;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the binary digits into the 2d array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        display(arr, m, n);
        for(i=0;i<m;i++)
        {
            if(arr[i][0]==0)
            flipr(arr,i,n);
        }
        for(j=0;j<n;j++)
        {
            if(countzeroes(arr, j, m)>countone(arr, j, m))
            flipc(arr,j,m);
        }
        su=su+sum(arr,m,n);
        System.out.println("Maximum sum="+su);
        display(arr, m, n);
    }    
}
