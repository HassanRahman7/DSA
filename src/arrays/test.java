package arrays;

public class test 
{
    public static void main(String[] args) 
    {
        int[] fines = {500, 340, 150, 400, 650, 700};
        int[] truck = {2345, 2444, 2567, 2588, 2789, 2891};
        int date = 17;
        
        int totalFine = 0;
        
        for (int i = 0; i < truck.length; i++) {
            if (truck[i] % 2 != date % 2) {
                totalFine += fines[i];
            }
        }
        
        System.out.println(totalFine);
          }
        
    }
    
