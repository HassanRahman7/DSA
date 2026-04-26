package TwoPointer;
import java.util.Arrays;
// https://leetcode.com/problems/the-latest-time-to-catch-a-bus/?utm=codolio
public class The_latest_time_to_catch_a_bus 
{
    public static int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) 
    {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int i=0,j=0,cc=0;
        while(i!=buses.length)
        {
            // int curr_pass_t=passengers[j];
            cc=0;
            while(j<passengers.length && passengers[j]<=buses[i] && cc<capacity)
            {
                cc++;
                j++;
            }
            i++;
        }
        int ans;
        // if(j!=0)
        //     int last_pass=passengers[j-1];
        // else
        // {
        //     // Meaning no one has boarded yet then we should just arrive at the time bus arrives.
        //     return buses[buses.length-1];
        // }
        if(cc==capacity)
            ans=passengers[j-1];
        else
            ans=buses[buses.length-1];
        int p=j-1;
        while(p>=0 && passengers[p]==ans)
        {
            ans--;
            p--;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int buses[]={3},passengers[]={2,4},capacity=2;
        System.out.println(latestTimeCatchTheBus(buses, passengers, capacity));
    }
    
}
