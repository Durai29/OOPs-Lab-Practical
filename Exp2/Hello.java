package Exp2;
import java.util.Scanner;
import java.util.Arrays;

public class Hello{
    static int arr[];
    public static void main(String arg[]){
        int arr1[],arr2[];
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scn.nextInt();
        arr = new int[size];
        arr1 = new int[size];
        arr2 = new int [size];
        for(int i=0;i<size;i++){
            System.out.print("Enter number: ");
            arr[i]=scn.nextInt();
        }
        arr1 = arr.clone();
        Arrays.sort(arr1);
        arr2 = Arrays.copyOf(arr,arr.length);
        display(arr);
        display(arr1);
        display(arr2);
    }
    private static void display(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("");
    }
    private static int[] reverseSort(int arr[]){
        
    }
}