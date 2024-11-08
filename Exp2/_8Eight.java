import java.util.Scanner;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class _8Eight {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        Hashtable <Character,Integer> hash = new Hashtable<>();
        Set <Character> set = new HashSet<>();

        System.out.print("Enter the sequence: ");
        String sequence = scn.nextLine();
        for(Character c:sequence.toCharArray()){
            set.add(c);     // to get the unique elements.
        }
        for(Character c:set){
            hash.put(c, 0); // Assigning the hashtable with unique values.
        }
        for(Character c:sequence.toCharArray()){
            hash.put(c,hash.get(c)+1); // Counting the number of occurence of the character.
        }
        boolean found = false;
        System.out.print("Duplicate elements: ");
        for(Character c:hash.keySet()){
            if(hash.get(c)>1){
                System.out.print(c+" ");
                found = true;
            }
        }
        if(!found){
            System.out.println("None");
        }
        scn.close();
    }
}
