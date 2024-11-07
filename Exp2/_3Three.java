package Exp2;
import java.util.Scanner;

public class _3Three {
    static int arr[];
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scn.nextInt();
        arr= new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            arr[i]= scn.nextInt();
        }
    }
    private static int[] sort(int arr[]){
        return;
    }
}
