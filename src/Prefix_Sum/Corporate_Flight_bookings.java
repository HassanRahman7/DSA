package Prefix_Sum;

public class Corporate_Flight_bookings
{
    public static int[] corpFlightBookings(int[][] arr, int n)
    {
        int ans[]=new int[n];
        int i=0;
        while(i!=arr.length)
        {
            int start=arr[i][0]-1;
            int end=arr[i][1]-1;
            int seats=arr[i][2];
            ans[start]=ans[start]+seats;
            if((end+1)!=ans.length)
                ans[end+1]=ans[end+1]-seats;
            i++;
        }
        int pre[]=new int[ans.length];
        i=1;
        pre[0]=ans[0];
        while(i!=ans.length)
            pre[i]=pre[i-1]+ans[i++];
        return pre;
    }

    public static void main(String[] args)
    {
        int bookings[][]={{1,2,10},{2,3,20},{2,5,25}};
        int n=5;
        int ans[]=corpFlightBookings(bookings,n);
        int i=0;
        while(i!=ans.length)
            System.out.print(ans[i++]+" ");
    }
}
