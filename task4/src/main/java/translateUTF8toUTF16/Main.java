package translateUTF8toUTF16;

public class Main {
    public static void main(String[] args) {
        String readPath = "task4/src/main/java/translateUTF8toUTF16/TextUTF8.txt";
        String writePath = "task4/src/main/java/translateUTF8toUTF16/TextUTF16.txt";
        String UTF8code = "UTF-8";
        String UTF16code = "UTF-16";


        TranslateCode changeCode = new TranslateCode();
        changeCode.writeUTF8toUTF16(readPath, writePath);


        System.out.println(changeCode.read(writePath, UTF16code));
    }
}
