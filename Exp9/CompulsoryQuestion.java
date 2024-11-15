package Exp9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

public class CompulsoryQuestion {
    static Scanner scn = new Scanner(System.in);
    public static void main(String arg[]){
       boolean on = true;
       /*while(on){
            System.out.println("1.Open a existing file");
            System.out.println("2.Creating a new file");
            System.out.println("3.Renaming a file");
            System.out.println("4.Deleting a file");
            System.out.println("5.Creating a directory");
            System.out.println("6.Finding the absolute path of a file");
            System.out.println("7.Get the file names of a directory");
            System.out.println("8.Exit");
            int choice = scn.nextInt();
            switch(choice){
                case 1 -> openFile();
                case 2 -> createNewFile();
                case 3 -> renameFile();
                case 4 -> deleteFile();
                case 5 -> createDirectory();
                case 6 -> findingAbsolutePath();
                case 7 -> getFileNamesInDirectory();
                case 8 -> on = false;
                default -> System.out.println("Enter a valid choice: ");
            } 
       }*/
    }

    private static void openFile(){
        System.out.print("Enter the file name: ");
        String fileName = scn.nextLine();
        File file = new File(fileName);
        if(file.exists()){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("File doesn't exists.");
        }
    }

    private static void createNewFile(){
        System.out.println("Enter the file name to create: ");
        String fileName = scn.nextLine();
        File file = new File(fileName);
        if(file.exists()){
            
        }
    }
}
