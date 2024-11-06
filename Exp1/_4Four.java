package Exp1;
import java.util.Scanner;

public class _4Four {
    public static void main(String arg[]){
        int total = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        for(int i=1;i<=num;i++){
            total += i;
        }
        System.out.println("The sum of first "+num+" numbers: "+total);
        scn.close();
    }
}
