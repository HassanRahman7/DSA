package Codevita;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Rectangle
{
    int x,y,w,h;
    public Rectangle(int x,int y,int w,int h)
    {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
    public boolean intersects(Rectangle other)
    {
        int thisTopY=this.y-this.h;
//        int thisTopY = this.y - this.h;
        int otherTopY = other.y - other.h;
        boolean seperated=(this.x + this.w <= other.x) ||(other.x + other.w <= this.x) || (thisTopY + this.h <= otherTopY) || (otherTopY + other.h <= thisTopY);
        if(seperated==true)
            return false;
        else
            return true;
    }
    public boolean equal(Object obj)
    {
        if(this==obj)
            return true;
        if(obj==null|| getClass()!=obj.getClass())
            return false;
        Rectangle rect=(Rectangle) obj;
        if(x==rect.x && y==rect.y && w==rect.w && h==rect.h)
            return true;
        else
            return false;
    }
}
public class StylusSimulator
{
    public static boolean handleDraw(int x,int y,int w,int h, List<Rectangle> canvas,int N,int M)
    {
        Rectangle rect=new Rectangle(x,y,w,h);
        if(x<0|| (x+w)>N||(y-h)<0||y>M)
            return false;
        for(Rectangle rect2:canvas)
        {
            if(rect.intersects(rect2)==true)
                return false;
        }
        canvas.add(rect);
        return true;
    }
    public static boolean removekohandle(int x,int y,int w,int h,List<Rectangle> canvas)
    {
        Rectangle torem=new Rectangle(x,y,w,h);
        return canvas.remove(torem);
    }
    public static boolean handleShrink(int x,int y,int newW,int newH,List<Rectangle> canvas)
    {
        Rectangle target=null;
        for(Rectangle r:canvas)
        {
            if(r.x==x && r.y==y)
            {
                target=r;
                break;
            }
        }
        if(target==null)
            return false;
        if(newW>target.w || newH > target.h)
            return false;
        target.w=newW;
        target.h=newH;
        return true;
    }
    public static boolean handleExtend(int x,int y,int newW,int newH,List<Rectangle> canvas,int N, int M)
    {
        Rectangle target=null;
        int targ_idx=-1;
        int i=0;
        while(i!= canvas.size())
        {
            Rectangle r=canvas.get(i);
            if(r.x==x && r.y==y)
            {
                target=r;
                targ_idx=i;
                break;
            }
            i++;
        }
        if(target==null)
            return false;
        if(newW<target.w ||newH<target.h)
            return false;
        Rectangle extendedRect=new Rectangle(x,y,newW,newH);
        if(x<0||(x+newW)>N ||(y-newH)<0||y>M)
            return false;
        i=0;
        while(i!=canvas.size())
        {
            if(i==targ_idx)
                continue;
            if(extendedRect.intersects(canvas.get(i))==true)
                return false;
            i++;
        }
        target.w=newW;
        target.h=newH;
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int C=sc.nextInt();
        sc.nextLine();
        List<Rectangle> canvas=new ArrayList<>();
        List<String> invaldcom=new ArrayList<>();
        int i=0;
        String command_line;
        while(i!=C)
        {
            command_line=sc.nextLine();
            String parts[]=command_line.split(" ");
            if(parts.length<5)
            {
                if(command_line.trim().isEmpty()==false)
                    invaldcom.add(command_line);
                continue;
            }
            boolean isValid=false;
            try
            {
                String commandType = parts[0];
                int x = Integer.parseInt(parts[1]);
                int y = Integer.parseInt(parts[2]);
                int w = Integer.parseInt(parts[3]);
                int h = Integer.parseInt(parts[4]);
                switch(commandType)
                {
                    case "draw":
                        isValid=handleDraw(x,y,w,h,canvas,N,M);
                        break;
                    case "remove":
                        isValid=removekohandle(x,y,w,h,canvas);
                        break;
                    case "extend":
                        isValid=handleExtend(x,y,w,h,canvas,N,M);
                        break;
                    case "shrink":
                        isValid=handleShrink(x,y,w,h,canvas);
                        break;
                }
            }
            catch (NumberFormatException e)
            {
                isValid=false;
            }
            if(isValid==false)
                invaldcom.add(command_line);
            i++;
        }
        for(String inval:invaldcom)
            System.out.println(inval);
        System.out.println(canvas.size());
    }
}
