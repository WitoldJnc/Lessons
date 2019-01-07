package Exceptions;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NotDirectoryException;

public class FileManager {
    private String path = "task5/src/main/java/Exceptions";
    private File file = new File(path);


    public void showfiles() {
        file = new File(file.getPath());
        String[] content = file.list();
        for (String each : content) {
            System.out.println(each);

        }
        System.out.println();
    }

    public void upDir() {
        try {
            file = new File(file.getParent());
            System.out.println("\n" + file.getAbsolutePath() + "\n");
        } catch (NullPointerException e) {
            System.err.println("Its root directory");
        }
    }

    public void downDir(String directory) {
        try {
            file = new File(file.getPath() + File.separator + directory);
            if (!file.isDirectory()) {
                file = new File(file.getParent());
                throw new NotDirectoryException(file.toString());
            }
            System.out.println("\n" + file.getAbsolutePath() + "\n");
        } catch (NullPointerException | NotDirectoryException e) {
            System.out.println("wrong directory name");
        }
    }


    public void createFile(String name) {
        String pathtonew = (file.getPath() + '/' + name + ".txt");
        try {
            File newFile = new File(pathtonew);
            if (newFile.exists()) {
                throw new FileAlreadyExistsException("file : \"" + name + "\" is already exist");

            } else {
                System.out.println("file : [" + name + ".txt] created");
                newFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFile(String name) {
        String pathtodel = (file.getPath() + '/' + name + ".txt");
        try {
            File delfile = new File(pathtodel);
            if (!delfile.isFile() & !delfile.exists()) {
                System.out.println("is not a file or file doesent exist");
            } else {
                delfile.delete();
                System.out.println("file : \"" + name + "\" is already deleted");
            }
        } catch (NullPointerException e) {
            System.err.println("file not found");
        }
    }

    public void writeToFile(String name, String text) {
        String pathtoWrite = (file.getPath() + '/' + name + ".txt");
        File file = new File(pathtoWrite);

        try {
            if (file.exists()) {
                PrintWriter writer = new PrintWriter(new BufferedWriter(
                        new FileWriter(pathtoWrite, true)));

                writer.write(text);
                writer.close();
                System.out.println("done");
            } else {
                System.err.println("file not found");
            }

        } catch (IOException e) {
            System.out.println("Text insertion is not allowed for this file");
        }

    }


    public void readfile(String name) {
        String pathtoread = (file.getPath() + '/' + name + ".txt");

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(pathtoread)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("file not found");
        }


    }
}
