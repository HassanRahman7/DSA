package PWC;

public class question3 
{
    public static String formatProducts(int A,int B)
    {
        int prod=1;
        int i=A;
        while(i!=B+1)
        {
            prod=prod*i;
            i++;
        }
        String work=""+prod;
        int j=work.length()-1;
        // char ch;
        int c=0;
        while(work.charAt(j)=='0')
        {
            j--;
            c++;
        }
        return work.substring(0,j+1)+"*10^"+c;
    }
    public static void main(String[] args) 
    {
        int A=3,B=10;
        System.out.println(formatProducts(A, B));        
    }
}
