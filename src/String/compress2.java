package String;

public class compress2 
{
    public static void main(String[] args) 
    {
        char arr[]={'a','a','b','b','c','c','c'};
        String s="",s2="";
        int i=0,j=1,c=1;
        for(i=0;i<arr.length;i++)
        s=s+arr[i];
        s=s+" ";
        i=0;
  
        char ch;
        while(i<s.length()&&j<s.length())
        {
            ch=s.charAt(i);
            if(ch==s.charAt(j))
            {
                c++;
                j++;
            }
            else
            {
                if(c==1)
                s2=s2+ch;
                else
                s2=s2+ch+c;
                c=1;
                i=j;
                j++;
            }
        }
    System.out.println(s2);
    for(i=0;i<s2.length();i++)
    arr[i]=s2.charAt(i);
        
    }
    
}
