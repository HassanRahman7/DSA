package CyberSecurity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
class playfair_cipher
{
    public static List<String> getPlayfairPairs(String text)
    {
        List<String> pairs=new ArrayList<>();
        StringBuilder sb=new StringBuilder(text);
        int i=0;
        while(i<sb.length())
        {
            char first=sb.charAt(i);
            char second='x';
            if((i+1)<sb.length())
                second=sb.charAt(i+1);
            if(first==second)
            {
                pairs.add(""+first+'x');
                i++;
            }
            else
            {
                if((i+1)==sb.length())
                {
                    pairs.add(""+first+"x");
                    break;
                }
                pairs.add(""+first+second);
                i=i+2;
            }
        }
        return pairs;
    }
    public static String columnSame(char mat[][],int i0,int j0,int i1,int j1)
    {
        // String ans="";
        if(i0==4 && j0==4)
            return ""+mat[0][j0]+mat[0][j1];
        else if (i0==4)
            return ""+mat[0][j0]+mat[i1+1][j1];
        else if (i1==4)
            return ""+mat[i0+1][j0]+mat[0][j1];
        else
            return ""+mat[i0+1][j0]+mat[i1+1][j1];
    }
    public static String rowSame(char mat[][],int i0,int j0,int i1,int j1)
    {
        if(j0==4 && j1==4)
            return ""+mat[i0][0]+mat[i1][0];
        else if(j0==4 && j1!=4)
            return ""+mat[i0][0]+mat[i1][j1+1];
        else if(j0!=4 && j1==4)
            return ""+mat[i0][j0+1]+mat[i1][0];
        else
            return ""+mat[i0][j0+1]+mat[i1][j1+1];
    }
    public static String diffcase(char mat[][],int i0,int j0,int i1,int j1) 
    {
        // for first letter we will take the row for the first character
        int row1=i0;
        // For first letter we will take the column for the second character
        int col1=j1;
        char first=mat[row1][col1];
        // Similarly for the second letter we will take the row from the second character
        int row2=i1;
        // Similarly for the second letter we will take the column from the first character
        int col2=j0;
        char second=mat[row2][col2];
        return ""+first+second;  
    }
    public static String getencryptpair(String p1,char mat[][]) 
    {
        int i=0,j=0,idx_0_i=-1,idx_0_j=-1,idx_1_i=-1,idx_1_j=-1;
        boolean found0=false,found1=false;
        for(i=0;i<5;i++)
        {
            char first_let=p1.charAt(0);
            char second_let=p1.charAt(1);
            for(j=0;j<5;j++)
            {
                if(mat[i][j]==first_let)
                {
                    idx_0_i=i;
                    idx_0_j=j;
                    found0=true;
                }
                if(mat[i][j]==second_let)
                {
                    idx_1_i=i;
                    idx_1_j=j;
                    found1=true;
                }
            }
        }
        // check same column or not
        if(idx_0_j==idx_1_j)
            return columnSame(mat,idx_0_i,idx_0_j,idx_1_i,idx_1_j);
        else
        {
            if(idx_0_i==idx_1_i)
                return rowSame(mat,idx_0_i,idx_0_j,idx_1_i,idx_1_j);
            else
                return diffcase(mat,idx_0_i,idx_0_j,idx_1_i,idx_1_j);
        }
    }
    public static void main(String[] args) 
    {
        char mat[][]=new char[5][5];
        StringBuilder key=new StringBuilder("monarchy");
        // boolean visited_array[]=new boolean[26];
        HashSet<Character> set=new HashSet<>();
        int i=0,j;
        // Now we shall put the letters into the key_matrix
        List<Character> puts=new ArrayList<>();
        i=0;
        while(i!=key.length())
        {
            puts.add(key.charAt(i));
            set.add(key.charAt(i++));
        }
        i=97;
        // j nhi daalenge theek hai i aane sai j bhi automaticaly lekar chalenge
        while(i!=123)
        {
            if(i!=105)
            {
                if(set.contains((char)i)==true)
                    i++;
                else
                {
                    puts.add((char)i);
                    set.add((char)i);
                }
            }
            else
            {
                puts.add((char)i);
                i++;
                i++;
            }
        }
        i=0;
        j=0;
        int c=0;
        while(i!=5)
        {
            j=0;
            while(j!=5)
            {
                mat[i][j++]=puts.get(c++);
            }
            i++;
        }
        // Now printing the matrix once to check whether everything is working properly or not!
        i=0;
        j=0;
        while(i!=5)
        {
            j=0;
            while(j!=5)
            {
                System.out.print(mat[i][j++]+" ");
            }
            System.out.println();
            i++;
        }
        String plain_text="ktmlover";
        // pair formation
        // but first we would remove j from the plain text
        String plain_text2="";
        i=0;
        while(i!=plain_text.length())
        {
            if(plain_text.charAt(i)!='j')
                plain_text2=plain_text2+plain_text.charAt(i);
            else
                plain_text2=plain_text2+'i';
            i++;
        }
        List<String> pairs=new ArrayList<>();
        pairs=getPlayfairPairs(plain_text2);
        String ans="";
        // Now we will go each pair by pair and search for the characters in the matrix
        i=0;
        while(i!=pairs.size())
        {
            String p1=pairs.get(i++);
            ans=ans+getencryptpair(p1, mat);
        }
        HashMap<String,String> map=new HashMap<>();
        map.put(ans,plain_text);
        System.out.println("Encrypted text="+ans);
        // Now for decryption 
        System.out.println("Decrypted Text:"+map.get(ans));
    }
}