package myPack.learnHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnError {
    public static void main(String[] args) throws FileNotFoundException,SecurityException {
        /*System.out.println("code start running");
        int a = 9;
        int b = 0;
        int result = 0;

        try {
            result = a/b;
        }
        catch (ArithmeticException ae) {
            System.out.println(Arrays.toString(ae.getStackTrace()));
        } finally {
            System.out.println("Error block is ended");
        }

        File f1 = new File("C:Aravind Yedida PF.pdf");
        FileInputStream fis = new FileInputStream(f1);
        System.out.println(fis);
        
            
        System.out.println("Result is " + result);
        System.out.println("Code is ended");
        */
        div1();
    }

    public static void div1() {
        System.out.println("code start running");
        int a = 9;
        int b = 0;
        int result = 0;

        try {
            result = a/b;
        } catch (ArithmeticException ae) {
            System.out.println(Arrays.toString(ae.getStackTrace()));
        }

        System.out.println("Result is " + result);
        System.out.println("Code is ended");
    }
}
