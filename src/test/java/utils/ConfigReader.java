package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {

    public static String get(String key) {
        // First, try reading from environment variable
        String value = System.getenv(key);
        if(value != null) {
            return value;
        }

        // Fallback to properties file if needed
        try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(fis);
            return prop.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException("Property " + key + " not found in environment or config file");
        }
    }
}
