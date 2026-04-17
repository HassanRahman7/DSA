package PWC;
// //: In an IT company there are n number of Employees , they are asked to stand in ascending order according to their heights.But some employees are not currently standing in their correct position.

// Your task is to find how many employees are there who are not standing in their correct positions.

// Example

// height=[1,2,1,3,3,4,3]

// The 4 employees at indices 1,2,5 and 6 are not in the right positions. The correct positions are (1,1,2,3,3,3,4).Return 4.

// Function Description

// Complete the function countEmployees in the editor below.

// count Employee has the following parameter(s):

// int height[n]:an array of heights in the order the employees are standing

// Returns:

// Int : the number of employees not standing in the correct positions

// Constraints

//    1<=n<=10^5
//    1<=height[i]<=10^9
// Sample case 0

// Sample input 0

// 7 ->height[] size n=7

// 1

// 2

// 1

// 3

// 3

// 4

// 3

// Sample output 0:

// 4

// Explanation

// The four employees who are  not standing in the correct positions are at indices [1,2,5,6] return 4. The correct positions are [1,1,2,3,3,3,4].
import java.util.*;
public class question1 
{
    public static int countEmployees(int arr[]) 
    {
        int brr[]=new int[arr.length];
        int i=0;
        while(i!=arr.length)
            brr[i]=arr[i++];
        Arrays.sort(brr);
        int c=0;
        i=0;
        while(i!=arr.length)
        {
            if(brr[i]==arr[i++])
                continue;
            else
                c++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        int height[]={1,2,1,3,3,4,3};
        System.out.println(countEmployees(height));
    }
    
}
