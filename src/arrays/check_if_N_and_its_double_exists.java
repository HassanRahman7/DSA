package arrays;

public class check_if_N_and_its_double_exists
{
    public static boolean checkIfExist(int[] arr)
    {
        int i=0,j=1;
        while(i!=arr.length)
        {
            j=0;
            while(j!=arr.length)
            {
                if(j==i)
                {
                    j++;
                    continue;
                }
                if(arr[i]==2*arr[j])
                    return true;
                j++;
            }
            i++;
        }
        return false;

    }
    public static void main(String[] args)
    {
        int arr[]={7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
}
