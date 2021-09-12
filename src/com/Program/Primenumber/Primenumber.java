package com.Program.Primenumber;


public class Primenumber {

    public static int count;
    public static int[] prime = new int[1000];
    public static int[] palindromearray = new int[100];
    public static int pcount = 0;


    public static void main(String[] args) {
        System.out.println("\nprinting the prime from 0 to 1000");
        primenumber();
        printprimenumber();

    }

    public static void printprimenumber() {
        System.out.println("\n\n Primenumbers are");
        for (int i = 0; i < count; i++) {
            System.out.println(prime[i]);
        }
    }

    public static void primenumber() {
        int number = 0;
        int i = 0;
        int num = 0;

        for (i = 0; i <= 1000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                number = i;
                arrayprime(number);
            }
        }
    }


    public static void arrayprime(int n) {
        prime[count] = n;
        count++;
    }

    public static void palindrome() {
        primenumber();
        for (int i = 0; i < count; i++) {
            int temp = prime[i];
            int number = temp;
            int rem, sum = 0;
            while (number > 0) {
                rem = number % 10;
                sum = (sum * 10) + rem;
                number = number / 10;
            }
            if (temp == sum) {
                palindromearray[pcount] = prime[i];
                pcount++;
            }
        }
        System.out.println("\n\n The Palindrome numbers in primenumber:");
        for (int i = 0; i < pcount; i++) {
            System.out.println(palindromearray[i]);
        }
    }


}

