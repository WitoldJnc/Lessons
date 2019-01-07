package t1byteIOStream;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "task4/src/main/java/t1byteIOStream/SampleText.txt";
        String outputFilePath = "task4/src/main/java/t1byteIOStream/Outputfile.txt";

        Stream stream = new Stream(inputFilePath, outputFilePath);

        stream.write(outputFilePath);

    }
}
