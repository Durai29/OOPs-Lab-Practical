package Exp1;
import java.util.Scanner;

public class _2Two {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[3];
        int greatest;
        char option[] = new char[]{'A','B','C'};
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value of "+option[i]+": ");
            arr[i] = scn.nextInt();
        }
        if(arr[0]>arr[1] && arr[0]>arr[2]){
            greatest = 0;
        }else if(arr[1]>arr[2]){
            greatest = 1;
        }else{
            greatest = 2;
        }
        System.out.println(option[greatest]+" is the greatest number.");
        scn.close();
    }    
}
