
public class _9Nine {
    public static void main(String args[]){
        int arr1[] = new int[]{1,2,3,4};
        int arr2[] = new int[]{2,4,6,8};
        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    System.out.println(j);
                    break;
                }
            }
        }
    }    
}
