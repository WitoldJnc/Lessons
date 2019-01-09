package properties_reader_map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader {
    private String path = "task6/src/main/java/properties_reader_map";
    private File file = new File(path);
    private Map<String, String> propertiesMap = new HashMap<>();
    private Properties properties = new Properties();

    public void setFile(String path) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream(new File(file.getPath() + '/' + path + ".properties")))) {

            properties.load(bufferedInputStream);
            properties.forEach((key, value) -> propertiesMap.put((String) key, (String) value));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void readValue(String key) {
        try {
            if (propertiesMap.containsKey(key)) {
                System.out.println(properties.getProperty(key));
            }
            if (propertiesMap == null) {
                throw new PropertyNotFoundException();
            }
        }catch (PropertyNotFoundException e){
            e.getMessage();
        }

    }


}