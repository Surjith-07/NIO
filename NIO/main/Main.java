package main;

import nio.NIOutil;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;
        String folder;
        String path;
        String fileName;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 For to Create Folder");
            System.out.println("2 For to Create SubFolder");
            System.out.println("3 For Create File");
            System.out.println("4 For Delete File");
            System.out.println("5 For Rename the File");
            System.out.println("6 For Wirte File");
            System.out.println("7 For Read File");
            value = scanner.nextInt();
            try {
                switch (value) {
                    case 1:
                        System.out.println("Enter the Path to Create Folder :");
                        path = scanner.next();
                        System.out.println("Enter the folder name :");
                        folder = scanner.next();
                        NIOutil.createFolder("/home/surjith-pt7589/Documents/", folder);
                        break;
                    case 2:
                        System.out.println("Enter the Path to Create SubFolder :");
                        path = scanner.next();
                        System.out.println("Enter the SubFolder name :");
                        folder = scanner.next();
                        NIOutil.createSubFolder("/home/surjith-pt7589/Documents/NioFolder/", folder);
                        break;
                    case 3:
                        System.out.println("Enter the Path to Create the File :");
                        path = scanner.next();
                        System.out.println("Enter the fileName :");
                        fileName = scanner.next();
                        NIOutil.createFile("/home/surjith-pt7589/Documents/NioFolder/", fileName);
                        break;
                    case 4:
                        System.out.println("Enter the Path to Delete the File :");
                        path = scanner.next();
                        System.out.println("Enter the fileName :");
                        fileName = scanner.next();
                        NIOutil.deleteFile("/home/surjith-pt7589/Documents/NioFolder/", fileName);
                        break;
                    case 5:
                        System.out.println("Enter the Path of Existing File :");
                        path = scanner.next();
                        System.out.println("Enter the fileName :");
                        fileName = scanner.next();
                        System.out.println("Enter the new fileName :");
                        String newFileName = scanner.next();
                        NIOutil.renameFile("/home/surjith-pt7589/Documents/NioFolder/", fileName, newFileName);
                        break;
                    case 6:
                        System.out.println("Enter the File Path :");
                        folder = scanner.next();
                        System.out.println("Write Data :");
                        String data = scanner.next();
                        NIOutil.writeFile("/home/surjith-pt7589/Documents/NioFolder/details.txt", data);
                        break;
                    case 7:
                        System.out.println("Enter the File Path :");
                        folder = scanner.next();
                        System.out.println("Data inside the File :");
                        NIOutil.readFile("/home/surjith-pt7589/Documents/NioFolder/details.txt");
                        break;
                    default:
                        System.out.println("Enter the Correct Option......!!!!!");
                        break;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
//home/surjith-pt7589/Current/NIO