import java.util.Scanner;
import java.util.Hashtable;

public class _7Seven{
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        Hashtable<Character,Integer> hash = new Hashtable<>();
        hash.put('a',0);
        hash.put('b',0);
        hash.put('c',0);
        hash.put('d',0);
        System.out.print("Enter the Sequence: ");
        String sequence = scn.nextLine();
        for(char ch:sequence.toCharArray()){
            hash.put(ch,hash.get(ch)+1);
        }
        for(Character c:hash.keySet()){
            if(hash.get(c)==1){
                System.err.println(c);
                break;
            }
        }
        scn.close();
    }
}