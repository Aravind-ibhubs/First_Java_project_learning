package com.learnLoop;

public class learnWhile {
    public static void main(String[] args) {
        // find odd number between 200 to 25
        int i = 200;
        while(i != 25) {
            if (i%2 != 0)
                System.out.println(i);
            i--;
        }
    }
}
