package Exp3;
import java.util.Scanner;

public class _2Two {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        StringBuilder paragraph = new StringBuilder();
        String line;
        System.out.println("Enter the sentence (End the sentence with empty line): ");
        while(! ((line=scn.nextLine()).isEmpty())){
            paragraph.append(line).append("\n");
        }
        line = paragraph.toString();
        
        int spaceCount = line.length() - line.replace(" ","").length();
        String words[] = line.split("\\s+");
        int wordCount = line.isEmpty() ? 0 : words.length;
        int charCount = line.length();
        int lineCount = line.split("\n").length;

        System.out.println("Space count: "+spaceCount);
        System.out.println("Words count: "+wordCount);
        System.out.println("Character count: "+charCount);
        System.out.println("Line Count: "+lineCount);
        scn.close();
    }
}
