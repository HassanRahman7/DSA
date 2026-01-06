package Recursion;

import java.util.Scanner;

public class mazepath 
{
    public static int maze(int row,int col,int m,int n) 
    {
        if(row==m||col==n)
        return 1;
        int rw=maze(row, col+1, m, n);
        int dw=maze(row+1, col, m, n);
        return (rw+dw);
    }
    public static int maze2(int m,int n) 
    {
        if(m==1||n==1)
        return 1;
        int rw=maze2( m, n-1);
        int dw=maze2(m-1, n);
        return (rw+dw);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        System.out.println(maze2( m, n));
        
        
    }
    
}
