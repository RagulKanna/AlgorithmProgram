package com.Program.Binarysearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateandWriteFile {
    public static void main(String[] args) {
        try {
            File myfile = new File("binaryfile.txt");
            myfile.createNewFile();
                System.out.println("File created: " + myfile.getName());
            } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter filewrite = new FileWriter("binaryfile.txt");
            filewrite.write("hello look good way to home");
            filewrite.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
