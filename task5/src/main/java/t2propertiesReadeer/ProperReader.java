package t2propertiesReadeer;

import java.io.*;
import java.util.Properties;

public class ProperReader {

    private Properties properties = new Properties();
    private String path = "task5/src/main/java/t2propertiesReadeer";
    private File file = new File(path);


    public void readValue(String key) {
        try {
            if (properties.containsKey(key)) {
                System.out.println(properties.getProperty(key));
            } else {
                throw new PropertyNotFoundException();
            }
        } catch (PropertyNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setFile(String path) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(
                    new FileInputStream(new File(file.getPath() + '/' + path + ".properties")));
            properties.load(bufferedInputStream);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}


