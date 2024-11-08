
public class _4Four {
    public static void main(String arg[]){
        int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int trans[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                trans[i][j] = arr[j][i];
            }
        }
        print(arr);
        print(trans);
    }   
    private static void print(int[][]arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    } 
}
