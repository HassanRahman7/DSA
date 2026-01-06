package arrays;
import java.util.ArrayList;
import java.util.List;
public class max_consecutives_ones
{
    public static int findMaxConsecutiveOnes(int[] arr)
    {
        int i=0,j=0,ans=0;
        List<Integer> work=new ArrayList<>();
        while(i!=arr.length)
            work.add(arr[i++]);
        work.add(0);
        i=0;
        j=0;
        while(i!=work.size() && j!=work.size())
        {
            if(work.get(j)==1)
            {
                j++;
                continue;
            }
            else
            {
                ans=(int)Math.max(ans,j-i);
                i=j+1;
                j++;
            }
        }
        return ans;

    }
    public static void main(String[] args)
    {
        int arr[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
