package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E5Exception {
    public static void main(String[] args) {

        FileInputStream fis=null;
        try{
            fis = new FileInputStream("C:\\Users\\poorn\\IdeaProjects\\NewSDETBAtch18\\Files\\Batch18.xlsx");

        }catch (FileNotFoundException f){
            System.out.println("Please check the path");
        }finally{
            try {
                fis.close();
            } catch (IOException e) {

            }
        }
    }
}
