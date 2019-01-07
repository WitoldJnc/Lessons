package localeResourceBundle;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AskQuestion {

    private ResourceBundle resourceBundle;
    private Locale locale;
    private Scanner scanner = new Scanner(System.in);

    public void setLang() {
        setLocale();
        resourceBundle = ResourceBundle.getBundle("task4/src/main/java/localeResourceBundle/puzzle", locale);
    }

    public void start() {
        setLang();
        quest(0);
        answer();
        scanner.close();
    }

    public void setLocale() {
        System.out.println("rus lang - 0 | eng lang - 1");

        byte num = scanner.nextByte();
        switch (num) {
            case 0: {
                locale = new Locale("ru", "RU");
                break;
            }
            case 1: {
                locale = new Locale("en", "US");
                break;
            }
            default:
                setLocale();
        }
    }

    public void quest(int n) {
        System.out.println("[" + (n += 1) + "] " + resourceBundle.getString("keyquestion1"));
        System.out.println("[" + (n += 1) + "] " + resourceBundle.getString("keyquestion2"));
    }

    public void answer() {

        byte num = scanner.nextByte();

        switch (num) {
            case 1: {
                System.out.println(resourceBundle.getString("keyanswer1"));
                break;
            }
            case 2: {
                System.out.println(resourceBundle.getString("keyanswer2"));
            }
            default: {
                break;
            }
        }

    }

}