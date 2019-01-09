package byte_oi_stream;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "task4/src/main/java/byte_oi_stream/SampleText.txt";
        String outputFilePath = "task4/src/main/java/byte_oi_stream/Outputfile.txt";

        Stream stream = new Stream(inputFilePath, outputFilePath);

        stream.write(outputFilePath);

    }
}
