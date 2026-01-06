package CodeNite2025;

import java.util.ArrayList;
import java.util.Scanner;

public class permuting_the_lcm
{
    public static long gcd(long a,long b)
    {
        long temp;
        while(b!=0)
        {
            temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static long lcm(long a,long b)
    {
        if(a==0||b==0)
            return 0;
        return (a/(gcd(a,b))*b);
    }
    public static void solvekre(Scanner sc)
    {
//        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        ArrayList<Integer> arr=new ArrayList<>();
        boolean use[]=new boolean[n+1];
        long curr_lcm=1;
        int d=1;
        while(d<=n)
        {
            if(k%d==0)
            {
                arr.add(d);
                use[d]=true;
                curr_lcm=lcm(curr_lcm,d);
            }
            d++;
        }
        if(curr_lcm==k)
        {
            System.out.println("YES");
            StringBuilder sb=new StringBuilder();
            for(int val:arr)
                    sb.append(val).append(" ");
            int i=1;
            while(i<=n)
            {
                if(use[i]==false)
                    sb.append(i).append(" ");
                i++;
            }
            System.out.println(sb.toString().trim());
        }
        else
            System.out.println("NO");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            solvekre(sc);
            t--;
        }
//        sc.close();
    }
}
