package Slidingwindowalgoritm;

public class Grumpy_bookstore_owner
{
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes)
    {
        if(grumpy.length==minutes)
        {
            int i=0,ans=0;
            while(i!=customers.length)
                ans=ans+customers[i++];
            return ans;
        }
        else if(minutes==1)
        {
            int i=0,max=Integer.MIN_VALUE;
            while(i!=customers.length)
            {
                if(grumpy[i]==1)
                    max=(int)Math.max(max,customers[i]);
                i++;
            }
            if(max==Integer.MIN_VALUE)
            {
                i=0;
                int ans=0;
                while(i!=customers.length)
                    ans=ans+customers[i++];
                return ans;
            }
            else
            {
                int ans=max;
                i=0;
                while(i!=customers.length)
                {
                    if(grumpy[i]!=0)
                    {
                        i++;
                        continue;
                    }
                    else
                        ans=ans+customers[i++];
                }
                return ans;
            }
        }
        int a=-1,b=-1,i=0,j=0,unsat_cust=0,max_unsat=0;
        while(j!=minutes-1)
        {
            if(grumpy[j]==0)
                j++;
            else
            {
                unsat_cust=unsat_cust+customers[j];
                if(unsat_cust>max_unsat)
                {
                    max_unsat=unsat_cust;
                    a=0;
                    b=minutes-1;
                }
                j++;
            }
        }
        i=0;
        j=minutes-1;
        // System.out.println(a);
        // System.out.println(b);
        while(i!=customers.length && j!=customers.length)
        {
            if(grumpy[i]==0)
                i++;
            else
            {
                unsat_cust=unsat_cust-customers[i];
                i++;
            }
            j++;
            if(j==customers.length)
                break;
            if(grumpy[j]==1)
            {
                unsat_cust=unsat_cust+customers[j];
                if(max_unsat<unsat_cust)
                {
                    max_unsat=unsat_cust;
                    a=i;
                    b=i+minutes-1;
                }
            }
        }
        i=0;
        int ans=0;
        while(i!=customers.length)
        {
            if((i>=a && i<=b )==false)
            {
                if(grumpy[i]==0)
                    ans=ans+customers[i++];
                else
                {
                    i++;
                    continue;
                }
            }
            else
                ans=ans+customers[i++];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int customers[]={1,0,1,2,1,1,7,5},grumpy[]={0,1,0,1,0,1,0,1},minutes=3;
        System.out.println(maxSatisfied(customers,grumpy,minutes));
    }
}
