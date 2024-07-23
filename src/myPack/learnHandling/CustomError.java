package myPack.learnHandling;

import java.io.IOException;

import javax.security.auth.login.LoginException;
import javax.sound.sampled.LineUnavailableException;

public class CustomError {
    public static void main(String[] args) throws Exception {
        int ae = 9;
        int aw = 0;
        int[] arr1 = {1,2,4,3,4} ;
 
        try {
            System.out.println(arr1[9]);
            System.out.println(ae/aw);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Stop using invalid operations");
        } catch (IndexOutOfBoundsException ib) {
            throw new LoginException("Use correct credentials");
        }
    }
}
