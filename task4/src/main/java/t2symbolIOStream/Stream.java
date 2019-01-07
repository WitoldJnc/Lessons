package t2symbolIOStream;

import java.io.*;
import java.util.HashMap;
import java.util.regex.*;

public class Stream {

    private String inputFile;
    private String outputFile;

    private FileReader input = null;
    private FileWriter output = null;

    private StringBuilder stringBuilder = new StringBuilder();
    private Pattern pattern = Pattern.compile("import|public|static|class|private|protected|try|cathc|int|byte|throw|" +
            "String|for|while|do|char|long|new|void|this|instanceof|super|const|package");

    public Stream(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }


    public String readSrteam(String inputFile) {
        try {
            input = new FileReader(inputFile);
            int i;

            while ((i = input.read()) != -1) {
                stringBuilder.append((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return stringBuilder.toString();
    }

    public String find() {
        HashMap<String, Integer> searchnotes = new HashMap<>();
        Matcher matcher = pattern.matcher(readSrteam(inputFile));

        while (matcher.find()) {
            String group = matcher.group();
            if (searchnotes.containsKey(group)) {
                Integer i = searchnotes.get(group);
                searchnotes.put(group, ++i);
            } else {
                searchnotes.put(group, 1);
            }
        }
        return searchnotes.toString();
    }


    public void write(String outputFile) {
        char[] chars = new char[find().length()];
        find().getChars(0, chars.length, chars, 0);

        try {
            output = new FileWriter(outputFile);
            for (char eachchar : chars) {
                output.write(eachchar);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                input.close();
                output.close();
            } catch (IOException ex) {
                throw new RuntimeException();
            }
        }
    }
}

