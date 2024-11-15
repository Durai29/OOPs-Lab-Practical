package Exp9;
import java.io.*;

public class _2Two {
    static int spaces,words,punc;
    public static void main(String arg[]){
        count();
        System.out.println(spaces+" "+words+" "+punc);
    }
    private static void count(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Exp9\\MyProfile.txt"));
            String line;
            while((line=reader.readLine())!=null){
                for(int i=0;i<line.length();i++){
                    switch (line.charAt(i)) {
                        case '.' -> {
                            words++;
                            punc++;
                        }
                        case ' ' -> {
                            spaces++;
                            words++;
                        }
                        case '\'',',',':'-> punc++;
                    }
                }
            } 
            reader.close();  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
