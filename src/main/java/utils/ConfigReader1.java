package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader1 {

    public static String read(String key) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.CONFIG_FILE_PATH1);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }



}
