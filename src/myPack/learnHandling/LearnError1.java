package myPack.learnHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LearnError1 {
    public static void main(String[] args) throws Throwable { // We can use Exceptions instead of thrrowable 
        //File f1 = new File("./sample.text");
        File f1 = new File("./resume.txt");
         
        // System.exit(0); = it is only case where final doesn't execute
        try (
            FileInputStream fi = new FileInputStream(f1);
            InputStreamReader isr = new InputStreamReader(fi);
            BufferedInputStream bw1 = new BufferedInputStream(fi);
            BufferedReader br = new BufferedReader(isr);
            FileReader fr = new FileReader(f1);
        ){
            String line = new String();
            String readed = new String();
        
            while ((line = br.readLine()) != null) {
                readed += line + "\n";
            }
            System.out.println(readed);
            
            int fNumber = 9;
            int sNumber = 0;

            String[] str1 = {"ER", "WSd", "SWE", "DEWS"};

            //System.out.println(fNumber / sNumber);
            System.out.println(str1[4]);

        } catch (FileNotFoundException | ArithmeticException fe1) {
            System.out.println(fe1.getMessage());
            //System.exit(0);
            //System.out.println(Arrays.toString(fe1.getStackTrace()));;
        //}catch (ArithmeticException ae1) {
            //System.out.println(ae1.getMessage());
        } catch (IndexOutOfBoundsException ib1) {
            System.out.println(ib1.getMessage());
        } finally {
            System.out.println("It is Final block");
        }
        
    }
}
