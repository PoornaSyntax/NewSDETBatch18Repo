package class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HW1FileHandling {
    public static void main(String[] args) throws IOException {
      String path ="C:\\Users\\poorn\\IdeaProjects\\NewSDETBAtch18\\Files\\Config1.properties";
      //Navigate to this location
        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));

    }
}
