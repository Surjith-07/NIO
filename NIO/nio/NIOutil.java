package nio;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class NIOutil {
    public static void createFolder(String folderPath, String folder) throws IOException {
        Path path = Paths.get(folderPath + folder);
        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("Folder :" + folder + " Created....!!!");
        } else {
            System.out.println("Folder :" + folder + " already in this location");
        }
        System.out.println(Files.exists(path));
        System.out.println("\n");
    }

    public static void createSubFolder(String folderPath, String subFolder) throws IOException {
        Path path = Paths.get(folderPath + subFolder);
        if (!Files.exists(path)) {
            Files.createDirectories(path);
            System.out.println("subFolder :" + subFolder + " Created....!!!");
        } else {
            System.out.println("subFolder :" + subFolder + " already in this location");
        }
        System.out.println(Files.exists(path));
        System.out.println("\n");
    }

    public static void createFile(String folderPath, String fileName) throws IOException {
        Path path = Paths.get(folderPath + fileName);
        if (!Files.exists(path)) {
            Files.createFile(path);
            System.out.println("File :" + fileName + " Created....!!!");
        } else {
            System.out.println("File :" + fileName + " already in this location");
        }
        System.out.println(Files.exists(path));
        System.out.println("\n");
    }

    public static void deleteFile(String filePath, String fileName) throws IOException {
        Path path = Paths.get(filePath + fileName);
        if (Files.exists(path)) {
            Files.delete(path);
            System.out.println("File :" + fileName + " Deleted....!!!");
        } else {
            System.out.println("Entered File Not in the Folder.....");
        }
        System.out.println(Files.exists(path));
        System.out.println("\n");
    }

    public static void renameFile(String filePath, String fileName, String newFileName) throws IOException {
        Path source = Paths.get(filePath + fileName);
        if (Files.exists(source)) {
            Path exist = Files.move(source, source.resolveSibling(filePath + newFileName),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println(Files.exists(exist) ? "File :" + exist.getFileName() + " Renamed....!!!" : "Renaming Error....!!!");
        } else {
            System.out.println("Entered File Not in the Folder.....");
        }
        System.out.println("\n");
    }

    public static void writeFile(String file, String data) throws IOException {
        Path source = Paths.get(file);
        String newLine = System.lineSeparator();
        if (Files.exists(source)) {
            Files.write(source, data.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }
        System.out.println("\n");
    }

    public static void readFile(String file) throws IOException {
        Path source = Paths.get(file);
        List<String> list = Files.readAllLines(source);
        list.forEach(System.out::println);
        System.out.println("\n");
    }
}
