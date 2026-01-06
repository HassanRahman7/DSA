package UEM_practice;
import java.util.Scanner;
public class student_results 
{
    public static void main(String[] args) 
    {
        final int STUDENTS = 100;
        final int COLUMNS = 4; // RollNo, Subject1, Subject2, Subject3
        int i,j;
        int[][] results = new int[STUDENTS][COLUMNS];
        int[] totalMarks = new int[STUDENTS];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data for 100 students (Roll No, Subject1, Subject2, Subject3):");
        for (i = 0; i < STUDENTS; i++) 
        {
            System.out.print("Student " + (i + 1) + ":\n");
            for (j = 0; j < COLUMNS; j++) {
                if (j == 0)
                    System.out.print("Roll No: ");
                else
                    System.out.print("Subject " + j + ": ");
                results[i][j] = sc.nextInt();
            }
            for(i=0;i<100;i++)
            {
                totalMarks[i]=0;
                for(j=1;j<3;j++)
                    totalMarks[i]=totalMarks[i]+results[i][j];
            }
            System.out.println("Printing the total marks of each student.");
            int max_marks=0,max_roll=-1;
            for(i=0;i<100;i++)
            {
                System.out.println("Student"+(i+1)+" Total marks"+totalMarks[i]);
                if(max_marks<totalMarks[i])
                {
                    max_marks=totalMarks[i];
                    max_roll=i-1;
                }
            }
            System.out.println("Max marks:"+max_marks+" Max roll number:"+max_roll);
            // Subject wise highest mark
            for(i=0;i<100;i++)
            {
                if(results[i][1]>max_marks)
                {
                    max_marks=results[i][1];
                    max_roll=results[i][0];
                }
            }
            System.out.println("Max marks in Subject 1:"+max_marks);
            System.out.println("Max roll number who acheived it:"+max_roll);
            max_marks=0;
            max_roll=-1;
            for(i=0;i<100;i++)
            {
                if(results[i][2]>max_marks)
                {
                    max_marks=results[i][2];
                    max_roll=results[i][0];
                }
            }
            System.out.println("Max marks in Subject 2:"+max_marks);
            System.out.println("Max roll number who acheived it:"+max_roll);
            max_marks=0;
            max_roll=-1;
            for(i=0;i<100;i++)
            {
                if(results[i][3]>max_marks)
                {
                    max_marks=results[i][3];
                    max_roll=results[i][0];
                }
            }
            System.out.println("Max marks in Subject 3:"+max_marks);
            System.out.println("Max roll number who acheived it:"+max_roll);
        }
    }
}

    

