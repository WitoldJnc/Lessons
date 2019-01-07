package t3translateUTF8toUTF16;

import java.io.*;

public class TranslateCode {

    private StringBuilder builder = new StringBuilder();


    public String read(String path, String code) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(path), code));

            while (reader.ready()) {
                builder.append(reader.readLine().concat(" :" + code));
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return builder.toString();
    }


    public void writeUTF8toUTF16(String readPath, String writePath) {

        String line;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(readPath), "utf-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream(new File(writePath)), "utf-16"))) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}