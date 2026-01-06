package TWODARRAY;
import java.util.*;
public class Valid_sudoku
{
    public static boolean checkbigsq(char board[][],int start_i, int start_j,int end_i,int end_j)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i,j;
        for(i=start_i;i<end_i;i++)
        {
            for(j=start_j;j<end_j;j++)
            {
                char ele=board[i][j];
                if(ele!='.')
                {
                    int int_ele=ele-'0';
                    if(map.containsKey(int_ele)==false)
                        map.put(int_ele,1);
                    else
                        return false;
                }
                else
                    continue;
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char[][] board)
    {
        // first we will try to solve it row wise
        int i=0,j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<board.length;i++)
        {
            for(j=0;j<board.length;j++)
            {
                char ele=board[i][j];
                if(ele!='.')
                {
                    int int_ele=ele-'0';
                    if(map.containsKey(int_ele)==false)
                        map.put(int_ele,1);
                    else
                        return false;
                }
                else
                    continue;
            }
            map.clear();
        }
        // Now we will do for the columns
        map.clear();
        for(j=0;j<board.length;j++)
        {
            for(i=0;i<board.length;i++)
            {
                char ele=board[i][j];
                if(ele!='.')
                {
                    int int_ele=ele-'0';
                    if(map.containsKey(int_ele)==false)
                        map.put(int_ele,1);
                    else
                        return false;
                }
                else
                    continue;
            }
            map.clear();
        }
        // Now for the 3*3 squares first 0 to 2
        i=0;
        j=0;
        if(checkbigsq(board,0,0,3,3)==true && checkbigsq(board,0,3,3,6)==true && checkbigsq(board,0,6,3,9)==true && checkbigsq(board,3,0,6,3)==true && checkbigsq(board,3,3,6,6)==true && checkbigsq(board,3,6,6,9)==true && checkbigsq(board,6,0,9,3)==true && checkbigsq(board,6,3,9,6)==true && checkbigsq(board,6,6,9,9)==true)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        // The error was using double quotes (Strings) instead of single quotes (chars).
        char board[][] = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Calling the method to check the board and printing the result.
        boolean isValid = isValidSudoku(board);
        System.out.println("Is the Sudoku board valid?" + isValid);
    }
}
