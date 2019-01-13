package symbol_io_stream;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "task4/src/main/java/symbol_io_stream/SampleText.txt";
        String outputFilePath = "task4/src/main/java/symbol_io_stream/Outputfile.txt";

        Stream stream = new Stream(inputFilePath, outputFilePath);

        stream.write(outputFilePath);
    }
}
