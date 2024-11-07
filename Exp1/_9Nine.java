package Exp1;
import java.util.Scanner;

public class _9Nine {
    static int num;
    static boolean flag = true;
    public static void main(String arg[]){
        menu();
    }
    private static void menu(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scn.nextInt();
        while(flag){
            System.out.println("\n1.Check BUZZ number. \n2.Check Odd or Even. \n3.Check +ve or -ve. \n4.Exit.");
            System.out.print("Enter your choice: ");
            int choice = scn.nextInt();

            switch (choice) {
                case 1 -> checkBuzz(num);
                case 2 -> checkOddEven(num);
                case 3 -> checkPosiNegi(num);
                case 4 -> {
                    System.out.println("Thank you.");
                    flag=false;
                }
            }
        }
        scn.close();
    }
    private static void checkBuzz(int num){
        if(num%10==7 || num%7==0){
            System.out.println("It's a Buzz number.");
        }else{
            System.out.println("It's not a Buzz number.");
        }
    }
    private static void checkOddEven(int num){
        if(num%2==0){
            System.out.println("It's an Even number.");
        }else{
            System.out.println("It's an Odd number.");
        }
    }
    private static void checkPosiNegi(int num){
        if(num>0){
            System.out.println("It's an Positive number.");
        }else{
            System.out.println("It's an Negative number.");
        }
    }
}
