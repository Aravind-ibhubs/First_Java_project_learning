package com.learnLoop;

public class DoWhile {
    public static void main(String[] args) {
        int  i = 40;
        int sumResult = 0;
        /*
        while(i<0) {
            System.out.println("while loop" + i);
        }

        do {
            System.out.println("do-while loop " + i);
        } while(i < 0);

        // prime number between 50 to 150
        while(i <= 150) {
            int count = 0;
            int j = 1;
            while(j <= i) {
                if (i % j == 0)
                    count++;
                    j++;
            }
            if(count == 2)
                System.out.println(i);
            i++;
        }*/

        while(i <= 80) {
            if (i % 2 == 0)
                sumResult += i;
            i++;
        }
        System.out.println(sumResult);
    }
}
