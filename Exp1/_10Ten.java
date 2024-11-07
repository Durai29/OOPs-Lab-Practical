package Exp1;
import java.util.Scanner;

public class _10Ten {
    static int basics = 499;
    static int kids = 200 + basics;
    static int sports = 700 + basics;
    static int english = 300 + basics;

    public static void main(String arg[]){
        Scanner scn =  new Scanner(System.in);
        System.out.println("1. Basics.\n2. Kids.\n3. Sports.\n4. English\n5. Nothing(Exit).\n");
            System.out.print("Choose the subscription option: ");
            int choice = scn.nextInt();
            switch(choice){
                case 1 -> System.out.println("Amount: "+basics);
                case 2 -> System.out.println("Amount: "+kids);              
                case 3 -> System.out.println("Amount: "+sports);                
                case 4 -> System.out.println("Amount: "+english);
                case 5 -> System.out.println("Thank you");
            }
        scn.close();
    }
}
