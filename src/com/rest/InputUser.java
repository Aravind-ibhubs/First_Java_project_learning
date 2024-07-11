package com.rest;

import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name");
        String nameStudent = userInput.nextLine();
        System.out.printf("Hi %s, How r u", nameStudent);
        String statusStudent = userInput.nextLine();
        System.out.println("What is your age");
        int ageStudent = userInput.nextInt();
        System.out.printf("Thank you %s . your age is %d at %s", nameStudent, ageStudent, statusStudent);
        userInput.close();
    }
}
