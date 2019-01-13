package translate;

public class Main {
    public static void main(String[] args) {
        String readPath = "task4/src/main/java/translate/TextUTF8.txt";
        String writePath = "task4/src/main/java/translate/TextUTF16.txt";
        String UTF8code = "UTF-8";
        String UTF16code = "UTF-16";


        TranslateCode changeCode = new TranslateCode();
        changeCode.writeUTF8toUTF16(readPath, writePath);


        System.out.println(changeCode.read(writePath, UTF16code));
    }
}
