package com.Program.Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter the first String: ");
        String s1= sc.nextLine();
        System.out.println("\n Enter the second String: ");
        String s2= sc.nextLine();
        checkanagram(s1,s2);
    }

    private static void checkanagram(String s1,String s2) {
        String str1=s1.replaceAll("//s","");
        String str2=s2.replaceAll("//s","");

        if (str1.length() != str2.length()) {
            System.out.println("\n The strings are not equal");
            System.out.println("\n " + s1 + " and " + s2 + " are not anagram")
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            if (Arrays.equals(ArrayS1, ArrayS2)) {
                System.out.println("\n " + s1 + " and " + s2 + " are anagram");
            } else {
                System.out.println("\n " + s1 + " and " + s2 + " are not anagram");
            }
        }
    }
}
