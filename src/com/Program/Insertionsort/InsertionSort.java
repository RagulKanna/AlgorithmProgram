package com.Program.Insertionsort;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InsertionSort {
    public static String[] word;
    private static String words;

    public static void main(String[] args) {
        Splitarray();
        insertionsort(word);
    }
    public static void Splitarray(){
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

    public static void insertionsort(String array[]){
        int n = array.length;
        for (int j = 1; j < n; j++) {
            String key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i].compareTo(key) > 0 ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }

        System.out.println("\nAfter Sorting");
        for (String s : word) {
            System.out.println(s);
        }
    }
}
