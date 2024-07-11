package com.rest;

import java.util.Scanner;

public class DecisionsMaking {
    public static void main(String[] args) {
        Scanner userStatus = new Scanner(System.in);
        System.out.println("Please the first number");
        int i1 = userStatus.nextInt();
        System.out.println("Please enter the second number");
        int i2 = userStatus.nextInt();
        System.out.println("Please the operation");
        String operation = userStatus.next();

        /*if (i > 0) {
            System.out.println("It is a Positive number");
            System.out.println("Enter the online status");
            String onlineStatus = userStatus.nextLine();
            if (onlineStatus == "Pass") {
                System.out.println("You are go for further rounds");
                System.out.println("Enter the round 1 status");
                String round1Status = userStatus.nextLine();
                if (round1Status == "Pass") {
                    System.out.println("You are selected for HR round");
                } else {
                    System.out.println("You can go to home");
                }
            } else {
                System.out.println("You can go to home");
            }
        }else {
            System.out.println("It is a negative number");
        }

        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }*/
        // if we need same value for two input
        switch (operation) {
            case "Add":
                System.out.println(i1 + i2);
                break;
            case "Sub":
                System.out.println(i1 - i2);
                break;
            case "Mul":
                System.out.println(i1 * i2);
                break;
            case "div":
                System.out.println(i1 / i2);
                break;
            case "Mod":
                System.out.println(i1 % i2);
                break;
            default:
                System.err.println("Please enter the valid operator");
                break;
        }

        userStatus.close();
    }
}
