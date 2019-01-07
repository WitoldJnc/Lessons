package t2propertiesReaderMap;

public class Main {
    public static void main(String[] args) {
        PropertiesReader propertiesReader = new PropertiesReader();
        propertiesReader.setFile("File");

        propertiesReader.readValue("key1");
        propertiesReader.readValue("key2");
    }
}
