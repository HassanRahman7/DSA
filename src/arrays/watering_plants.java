package arrays;

public class watering_plants
{
    public static int wateringPlants(int[] plants, int capacity)
    {
        int i=-1,ans=0,cap=capacity;
        while(i!=plants.length-1)
        {
            if(cap>=plants[i+1])
            {
                ans=ans+1;
                cap=cap-plants[i+1];
                i++;
            }
            else
            {
                ans=ans+(i+1)+(i+2);
                cap=capacity;
                cap=cap-plants[++i];
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int plants[] = {7,7,7,7,7,7,7}, capacity = 8;
        System.out.println(wateringPlants(plants,capacity));

    }
}
