package leetcode;

import java.util.Scanner;

public class passthepillow 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,ct=0,pp=1;
        System.out.println("n:");
        n=sc.nextInt();
        int time;
        time=sc.nextInt();
        boolean dir=false;
        while(ct<time)
        {
            if(dir==false)
            pp++;
            else 
            pp--;
            if(pp==1||pp==n)
            dir=!dir;
            ct++;
        }
        System.out.println(pp);
    
        }
    }

