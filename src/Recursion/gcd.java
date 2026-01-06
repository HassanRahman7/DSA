package Recursion;

import java.util.Scanner;

public class gcd 
{
    public static int ans(int m,int n) 
    {
        if(m==n)
        return m;
        else if(m>n)
        return ans(m-n,n);
        else
        return ans(m,n-m);
    }
    public static int nthTerm(int n) 
    {
        if(n==1||n==2)
        return 1;
        return (n*nthTerm(n-1)-(n-1)*nthTerm(n-2)+(n-2)*3);
    }
    public static void main(String[] args) 
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m:");
        m=sc.nextInt();
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        System.out.println("GCD:"+(ans(m, n)));
        System.out.println(nthTerm(3));
        
    }
    
}
