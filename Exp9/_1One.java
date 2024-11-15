package Exp9;
import java.io.*;

public class _1One {
    public static void main(String arg[]){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("MyProfile.txt"));
            writer.write("Hi, I'm Durai Murugan.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            File file = new File("MyProfile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Exp9\\MyProfile.txt"));
            String line;
            while((line=reader.readLine())!=null){
                writer.write(line);
            }
            reader.close();
            writer.close();
            if(file.delete()){
                System.out.println("Deleted file");
            }else{
                System.out.println("Error in deleting the file.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
