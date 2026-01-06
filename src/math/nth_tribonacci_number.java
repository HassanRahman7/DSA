package math;

public class nth_tribonacci_number
{
    public static int tribonacci(int n)
    {
        int a=0,b=1,c=1;
        if(n==0)
            return 0;
        else if(n==1||n==2)
            return 1;
        else if(n==3)
            return 2;
        else
        {
            int i=0;
            // int temp=0;
            for(i=3;i<=n;i++)
            {
                int temp=a+b+c;
                a=b;
                b=c;
                c=temp;
                if(i==n)
                    return temp;
            }
            return -1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(tribonacci(4));
    }
}
