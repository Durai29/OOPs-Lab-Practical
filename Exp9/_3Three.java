package Exp9;
import java.io.*;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class _3Three {
    public static void main(String arg[]){
        Hashtable<String,Integer> table = new Hashtable<>();
        Set<String> set = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Hello"));
            String words[];
            words = (reader.readLine()).split("\\s+");
            for(String word:words){
                set.add(word);
            }
            for(String word:set){
                table.put(word,0);
            }
            for(String word:words){
                table.put(word,table.get(word)+1);
            }
            for(String word:table.keySet()){
                System.out.println(word+" "+table.get(word));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
