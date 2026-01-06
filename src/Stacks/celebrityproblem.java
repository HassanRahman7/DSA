package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class celebrityproblem 
{
    public static int celebrity(int mat[][]) 
    {
        Stack <Integer> st=new Stack<>();
        int i,v1,v2;
        for(i=0;i<mat.length;i++)
        st.push(i);
        while(st.size()>1)
        {
            v1=st.pop();
            v2=st.pop();
            if(mat[v1][v2]==0)
            {
                //v1 might be a celebrity but v2 is not a celebrity.
                st.push(v1);
            }
            else if(mat[v2][v1]==0)
            {
                //v2 can be a celebrity but v1 is not a celebrity.
                st.push(v2);
            }
        }
        if(st.size()==0)
        return -1;
        else
        {
            int potentialceleb=st.pop();
            for(i=0;i<mat.length;i++)
            {
                if(mat[potentialceleb][i]==1)
                return -1;
            }
            for(i=0;i<mat.length;i++)
            {
                if(i==potentialceleb)
                continue;
                if(mat[i][potentialceleb]==0)
                return -1;
            }
            return potentialceleb;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[3][3];
        int i,j;
        System.out.println("Enter 0 and 1:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }   
        if(celebrity(mat)!=-1)
            System.out.println("There is a celebrity:"+celebrity(mat));
        else
            System.out.println("There is no celebrity.");
    }    
}