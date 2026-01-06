package Binarysearch;

public class leetcode744 
{
    public static char nextGreatestLetter(char[] letters, char target) 
    {
        int lo=0,hi=letters.length-1,mid=0;
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            if(letters[mid]>target)
            hi=mid-1;
            else
            lo=mid+1;
        }
        if(lo>=letters.length)
        return letters[0];
        else
        return letters[lo];
        
    }
    public static void main(String[] args) 
    {
        char letters[]={'x','x','y','y'};
        char target='z';
        System.out.println(nextGreatestLetter(letters,target));   
    }    
}
