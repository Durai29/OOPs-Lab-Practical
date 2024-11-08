import java.util.Scanner;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class _10Ten {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        Hashtable <Character,Integer> hash = new Hashtable<>();
        Set <Character> set = new HashSet<>();

        System.out.print("Enter a String: ");
        String word = scn.nextLine();
        for(Character c:word.toCharArray()){
            set.add(c);
        }
        for(Character c:set){
            hash.put(c,0);
        }
        for(Character c:word.toCharArray()){
            hash.put(c,hash.get(c)+1);
        }
        System.out.print("Enter Character: ");
        String ch = scn.nextLine();
        System.out.print(hash.get(ch.charAt(0)));
        scn.close();              
    }    
}
