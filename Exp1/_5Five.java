package Exp1;

public class _5Five {
    enum choice{
        SPACE,
        STAR;
    }
    public static void main(String arg[]){
        int num = 5;
        for(int i=1;i<=num;i++){
          /*print(choice.STAR,i);
            print(choice.SPACE,num-i);
            System.out.println(""); */

            print(choice.SPACE,num-i);
            print(choice.STAR,i);
            System.out.println("");
        }
    }

    public static void print(choice ch,int n){
        if(ch==choice.SPACE){
            for(int i=0;i<n;i++){
                System.out.print("  ");
            }
        }else{
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
        }
    }
}
