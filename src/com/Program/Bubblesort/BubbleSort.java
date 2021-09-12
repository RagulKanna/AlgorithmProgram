package com.Program.Bubblesort;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BubbleSort {
    public static String[] word;
    private static String words;

    public static void main(String[] args) {
        Splitarray();
        bubblensort(word);
    }

    private static void bubblensort(String[] arr) {
        int n = arr.length;
        String temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("\nAfter Sorting");

        for (String s : word) {
            System.out.println(s);
        }
    }
    private static void Splitarray(){
        try
        {
            FileInputStream filestr = new FileInputStream("binaryfile.txt");
            DataInputStream data_input = new DataInputStream(filestr);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(data_input));

            while ((words = buffer.readLine()) != null)
            {
                System.out.println("\nBefore Sorting");
                words = words.trim();
                if ((words.length()!=0))
                {
                    word=words.split(" ");
                    for (String s : word) {
                        System.out.println(s);
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
