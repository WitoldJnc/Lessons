package properties_reader_map;

public class Main {
    public static void main(String[] args) {
        PropertiesReader propertiesReader = new PropertiesReader();
        propertiesReader.loadProps("File");

        propertiesReader.getProperty("key1");
        propertiesReader.getProperty("key5");
    }
}
