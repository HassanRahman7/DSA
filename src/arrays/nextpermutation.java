package arrays;
public class nextpermutation 
{
    public static void swap(int arr[],int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
            swap(arr,i++,j--);
    }
    public static void nextPermutation2(int[] arr) 
    {
        int i=arr.length-1,idx=0,idx2=0;
        boolean flag=false;
        while(i>0)
        {
            if(arr[i]<=arr[i-1])
            {
                i--;
                continue;
            }
            else
            {
                flag=true;
                idx=i-1;
                break;
            }
        }
        if(flag==false)
        {
            reverse(arr,0,arr.length-1);
            return;
        }
        System.out.println(idx);
        i=arr.length-1;
        while(i>=0)
        {
            if(arr[i]<=arr[idx])
            {
                i--;
                continue;
            }
            else
            {
                idx2=i;
                break;
            }
        }
        //Swap elements from idx and idx2;
        swap(arr,idx,idx2);
        //Now we will reverse the remaining part from idx to get our answer.
        reverse(arr,idx+1,arr.length-1);
        
    }
    public static void main(String[] args) 
    {
        int arr[]={3, 1, 5, 1};
        nextPermutation2(arr);
        int i;
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]);
    }    
}
