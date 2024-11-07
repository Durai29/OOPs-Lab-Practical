package Exp1;

public class _6Six {
    static int count = 1;
    public static void main(String arg[]){
        int n = 4;
        for(int i=1;i<=n;i++){
            print(i);
            System.out.println("");
        }
    }

    public static void print(int num){
        for(int i=0;i<num;i++){
            System.out.print((count++)+" ");
        }
    }
}
