package arrays;

public class Watering_plants_2
{
    public static int minimumRefill(int[] plants, int capacityA, int capacityB)
    {
        int total_refils=0;
        int alice=0,bob=plants.length-1,curr_water_A=capacityA,curr_water_B=capacityB;
        while(alice<=bob)
        {
            if(alice==bob)
            {
                if(curr_water_A>=curr_water_B)
                {
                    if(curr_water_A>=plants[alice])
                        curr_water_A=curr_water_A-plants[alice++];
                    else
                    {
                        total_refils++;
                        curr_water_A=capacityA;
                        curr_water_A=curr_water_A-plants[alice++];
                    }
                }
                else
                {
                    if(curr_water_B>=plants[bob])
                        curr_water_B=curr_water_B-plants[bob--];
                    else
                    {
                        total_refils++;
                        curr_water_B=capacityB;
                        curr_water_B=curr_water_B-plants[bob--];
                    }
                }
            }
            else
            {
                if(curr_water_A>=plants[alice])
                    curr_water_A=curr_water_A-plants[alice++];
                else
                {
                    total_refils++;
                    curr_water_A=capacityA;
                    curr_water_A=curr_water_A-plants[alice++];
                }
                if(curr_water_B>=plants[bob])
                    curr_water_B=curr_water_B-plants[bob--];
                else
                {
                    total_refils++;
                    curr_water_B=capacityB;
                    curr_water_B=curr_water_B-plants[bob--];
                }
            }
        }
        return total_refils;
    }

    public static void main(String[] args)
    {
        int plants[]={5};        int capacityA=10,caacityB=8;
        System.out.println(minimumRefill(plants,capacityA,caacityB));
    }
}
