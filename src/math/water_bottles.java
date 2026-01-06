package math;

public class water_bottles
{
    public static int numWaterBottles(int numBottles, int numExchange)
    {
        int ans=0;
        int rem=0;
        while(numBottles>0)
        {
            ans=ans+numBottles;
            rem=rem+numBottles%numExchange;
            numBottles=numBottles/numExchange; // 3 0
            // rem=rem+numBottles%numExchange; // 3 6
            // System.out.println("rem "+rem);
            if(numBottles==0)
            {
                numBottles=(int)rem/numExchange; // 1
                rem=rem%numExchange; // 2
            }
            // System.out.print(numBottles+" ");
        }
        return ans;
    }

    public static void main(String[] args)
    {
        System.out.println(numWaterBottles(9,3));
    }
}
