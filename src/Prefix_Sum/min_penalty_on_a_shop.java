package Prefix_Sum;

public class min_penalty_on_a_shop
{
    public static int bestClosingTime(String customers)
    {
        int pre_N[]=new int[customers.length()+1];
        int i;
        if(customers.charAt(0)=='Y')
            pre_N[0]=0;
        else
            pre_N[0]=1;
        i=1;
        while(i!=pre_N.length)
        {
            char ch=customers.charAt(i-1);
            if(ch=='Y')
                pre_N[i]=pre_N[i-1]+0;
            else
                pre_N[i]=pre_N[i-1]+1;
            i++;
        }
        int suf_Y[]=new int[customers.length()+1];
        i=customers.length()-1;
        if(customers.charAt(i)=='Y')
            suf_Y[i]=1;
        else
            suf_Y[i]=0;
        i--;
        while(i!=-1)
        {
            char ch=customers.charAt(i);
            if(ch=='Y')
                suf_Y[i]=suf_Y[i+1]+1;
            else
                suf_Y[i]=suf_Y[i+1]+0;
            i--;
        }
        // return 1;
        int ans[]=new int[pre_N.length];
        for(i=0;i<ans.length;i++)
            ans[i]=pre_N[i]+suf_Y[i];
        int min=Integer.MAX_VALUE;
        for(i=0;i<ans.length;i++)
        {
            if(ans[i]<min)
                min=ans[i];
        }
        for(i=0;i<ans.length;i++)
        {
            if(ans[i]==min)
                return i;
            else
                continue;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.println(bestClosingTime("YYYY"));
    }
}
