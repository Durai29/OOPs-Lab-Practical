package Exp3;
import java.util.Scanner;

public class _1One {
    public static Scanner scn = new Scanner(System.in);
    private static int count;

    public static void main(String arg[]){
        String arr[] = new String[5];
        for(int i=1;i<=5;i++){
            System.out.print("Enter sequence "+i+" : ");
            arr[i-1] = scn.nextLine();
        }    
        System.out.print("Enter the character to search: ");
        String ch = scn.nextLine();

        for(String a: arr){
            int temp = 0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==ch.charAt(0)){
                    temp++;
                }
            }
            if(temp>count){
                count = temp;
            }
        }

        System.out.println("Highest count: "+count);
    }
}
