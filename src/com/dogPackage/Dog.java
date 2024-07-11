package com.dogPackage;

class Dog {
    int license = 562315; // Instance variable (non-static field)
    static String name = "Buddy"; // Class variable (static field)

    public static void main(String[] args) {
        // Variable methods are defination and initialization.
        int pincode; // Defination and it is local variable
        pincode = 50023; // Initialization
        pincode = 58964; // Re - Initialization
        System.out.println(pincode);

        Dog dog = new Dog();
        System.out.println(dog.license);

        System.out.println(name);

        test1(896); // parameters
    }

    public static void test1(int newHeight) {
        double PI = 3.14; // Constants
        double MATH_PI = 3.14; // constants

        System.out.println(name);
        System.out.println(new Dog().license);
        System.out.println(newHeight);
        System.out.println(PI);
        System.out.println(MATH_PI);
    }
}
