import java.util.Scanner;

public class _5Five {
    static Scanner scn = new Scanner(System.in);
    static int arr[],searchArr[];
    public static void main(String arg[]){
        int arrSize = getSize("array",arr);
        arr = new int[arrSize];
        getInput(arr,arrSize);
        int searchArrSize = getSize("Search array",searchArr);
        searchArr = new int[searchArrSize];
        getInput(searchArr,searchArrSize);
        find();
    }
    private static int getSize(String a,int array[]){
        System.out.print("Enter the size of "+a+" : ");
        int arrSize = scn.nextInt();
        return arrSize;
    }
    private static void getInput(int array[],int arrSize){
        for(int i=0;i<arrSize;i++){
            System.out.print("Enter element: ");
            array[i] = scn.nextInt();
        }
    }
    private static void find(){
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<searchArr.length;j++){
                if(arr[i]==searchArr[j]){
                    System.out.println("Found "+arr[i]+" in "+i+" ");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Not Found.");
            }
        }
    }
}
