package com.Program.Primenumber;

public class Primenumber {
    public static int[] prime=new int[1000];
    public static int count=0;

    public static void main(String[] args) {
        System.out.println("\nprinting the prime from 0 to 1000");
        primenumber();
        printprimenumber();
    }

    private static void printprimenumber() {
        for(int p=0;p<count;p++)
        {
            System.out.println(prime[p]);
        }
    }

    private static void primenumber() {
       int number=0;
        int i =0;
        int num =0;

        for (i = 0; i <= 1000; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                number=i;
                arrayprime(number);
            }
        }
    }


    private static void arrayprime(int n) {
        prime[count] = n;
        count++;
    }

}

