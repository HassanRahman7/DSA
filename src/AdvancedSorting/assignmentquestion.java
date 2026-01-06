package AdvancedSorting;


public class assignmentquestion 
{
    public static void swap(int arr[],int i,int j) 
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void print(int arr[]) 
    {
        int i;
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) 
    {
        int arr[]={3,8,6,7,5,9,10};      
        int i=0,j=i+1,f=-1,s=-1;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
                continue;
            else
                {
                    f=i;
                    break;
                }
        }
        i++;
        int k=f+1;
        if(f+1==arr.length-1)
        k=0;
        for(j=k;j<arr.length-1;j++)
        {
            if(arr[j]<arr[j+1])
                continue;
            else
            {
                s=j+1;
                break;
            }
        }
        if(s==-1)
        s=f+1;
        System.out.println(f);
        System.out.println(s);
        swap(arr, f, s);
        print(arr);
    }
}
