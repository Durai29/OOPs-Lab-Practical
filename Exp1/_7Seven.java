package Exp1;
import java.util.Scanner;

public class _7Seven {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        double marks[] = new double[5];
        String subjects[] = new String[]{"Physics","Chemistry","Biology","Maths","Computer"};
        int n=5;
        for(int i=0;i<n;i++){
            System.out.print("Enter the mark of "+subjects[i]+" : ");
            marks[i] = scn.nextDouble();
        }
        System.out.println("Grade: "+findGrade(avg(marks)));
        scn.close();
    }

    private static double avg(double marks[]){
        double total = 0.0;
        for(double mark:marks){
            total += mark;
        }
        return total/5;
    }

    private static char findGrade(double avg){
        if(avg>=90) return 'A';
        else if(avg>=80) return 'B';
        else if(avg>=70) return 'C';
        else if (avg>=60) return 'D';
        else if (avg>=40) return 'E';
        else return 'F';
    }
}
