package exceptions;

import java.util.Scanner;

public class Console {
    private FileManager fileManager = new FileManager();
    private Scanner scanner = new Scanner(System.in);


    public void start() {
        String command = "";
        String dir;
        showcommand();

        while (!command.equals("exit")) {
            command = scanner.next();
            switch (command) {
                case "help":
                    showcommand();
                    break;

                case "show":
                    fileManager.showfiles();
                    break;

                case "up":
                    fileManager.upDir();
                    break;

                case "down":
                    dir = scanner.next();
                    fileManager.downDir(dir);
                    break;

                case "create":
                    dir = scanner.next();
                    fileManager.createFile(dir);
                    break;


                case "del":
                    dir = scanner.next();
                    fileManager.deleteFile(dir);
                    break;


                case "write":
                    dir = scanner.next();
                    String text = scanner.nextLine();
                    fileManager.writeToFile(dir, text);
                    break;


                case "read":
                    dir = scanner.next();
                    fileManager.readfile(dir);
                    break;

                case "exit":
                    break;

                default:
                    System.out.println("wrong command");
                    break;
            }
        }

    }

    public static void showcommand() {
        System.out.println("help                       - print all commands \n" +
                "show                       - print all content in directory \n" +
                "up                         - up to parent directory \n" +
                "down +text                 - down to lower directory \n" +
                "create +text               - create new .txt file \n" +
                "del +filename              - delete .txt file \n" +
                "read +filename             - read .txt file\n" +
                "write +filename +text      - write new .txt file \n" +
                "exit                       - close program \n");
    }

}
