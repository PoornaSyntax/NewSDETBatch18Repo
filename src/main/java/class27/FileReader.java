package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

        static void readFile() throws FileNotFoundException {
            FileInputStream fileinputstream=new FileInputStream("C:\\Users\\poorn\\IdeaProjects\\NewSDETBAtch18\\Files\\Batch18.xlsx");

        }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Please check th file path");
        }
    }
    }

