package String;
import java.util.ArrayList;
import java.util.List;
public class cells_in_a_range_on_an_excel_sheet
{
    // https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/description/
    public static List<String> cellsInRange(String s)
    {
        List<String> ans=new ArrayList<>();
        char col1=s.charAt(0);
        char col2=s.charAt(3);
        int i,j,row1=s.charAt(1)-'0',row2=s.charAt(4)-'0';
        for(i=(int)col1;i<=(int)col2;i++)
        {
            for(j=row1;j<=row2;j++)
            {
                String p=""+(char)i+j;
                ans.add(p);
            }
        }
        return ans;
    }
    public static void print(List<String> ans)
    {
        int i=0;
        while(i!=ans.size())
            System.out.print(ans.get(i++)+" ");
    }
    public static void main(String[] args)
    {
        List<String> ans=new ArrayList<>();
        ans=cellsInRange("K1:L2");
        print(ans);
    }
}
