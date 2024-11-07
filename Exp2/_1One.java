package Exp2;
import java.util.Scanner;

public class _1One {
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
        System.out.print("Enter number to Search: ");
        int searchNum = scn.nextInt();
        if(found(searchNum)){
            System.out.println("Found the element in the array.");
        }else{
            System.out.println("Didn't fint the element in the array.");
        }
        scn.close();
    }
    private static boolean found(int searchNum){
        for(int a: arr){
            if(a==searchNum){
                return true;
            }
        }
        return false;
    }
}
