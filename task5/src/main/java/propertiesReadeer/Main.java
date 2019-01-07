package propertiesReadeer;

public class Main {
    public static void main(String[] args) {
        ProperReader properReader = new ProperReader();

        properReader.setFile("File");
        properReader.setFile("File2");

        properReader.readValue("key1");
        properReader.readValue("key5");

    }

}
