package Exp9;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Practice {
    public static void main(String arg[]){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Hello"));
            writer.write("Love you so much LO");
            writer.write("\nCan't wait to see you again.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Hello"));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
