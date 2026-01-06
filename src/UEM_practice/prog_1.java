package UEM_practice;

import java.util.Scanner;

public class prog_1 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        double x[]=new double[n];
        double y[]=new double[n];
        double m,sum_xy=0.0,sum_x=0.0,sum_y=0.0,sum_xsq=0.0,sum_ysq=0.0;
        int i;
        System.out.println("Enter value of x followed by y");
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextDouble();
            y[i]=sc.nextDouble();
            sum_xy=sum_xy+x[i]*y[i];
            sum_x=sum_x+x[i];
            sum_y=sum_y+y[i];
            sum_xsq=sum_xsq+x[i]*x[i];
            sum_ysq=sum_ysq+y[i]*y[i];
        }
        m=(n*sum_xy-sum_x*sum_y)/(Math.pow((n*sum_xsq-sum_ysq),2));
        double c;
        c=(sum_y-m*sum_x)/n;
        System.out.println(m);
        System.out.println(c);
    }
}
