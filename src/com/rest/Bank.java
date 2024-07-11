package com.rest;

class Bank {
    static int currentBalance = 1500;

    public static void greetingCustomer() {
        System.out.println("Hi, welcome to your space");
    }

    public void deposit(int ammount) {
        currentBalance = currentBalance + ammount;
    }

    public void withDraw(int ammount) {
        currentBalance = currentBalance - ammount;
    }

    public static int checkBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        greetingCustomer();
        System.out.println("Your current balance : " + checkBalance());
        bank.deposit(1500);
        System.out.println("Your current balance : " + checkBalance());
        bank.withDraw(2000);
        System.out.println("Your current balance : " + checkBalance());
        System.out.println(checkBalance());   
    }
}
