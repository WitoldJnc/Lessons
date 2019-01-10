package properties_reader_map;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader {
    private String path = "task6/src/main/java/properties_reader_map";
    private File file = new File(path);
    private Map<String, String> propertiesMap = new HashMap<>();
    private Properties properties = new Properties();

    public void loadProps(String path) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream(new File(file.getPath() + '/' + path + ".properties")))) {

            properties.load(bufferedInputStream);
            properties.forEach((key, value) -> propertiesMap.put((String) key, (String) value));

        } catch (IOException e) {
            throw new IllegalArgumentException("Path not found");
        }
    }

    public void getProperty(String name) {
        String property = propertiesMap.get(name);

        if (property != null) {
            System.out.println(property);
        } else {
            throw new PropertyNotFoundException();
        }
    }

}