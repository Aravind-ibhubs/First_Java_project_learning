// WAP to find the number of lines in text file
package myPack.learnFileHandle.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileReader fs = new FileReader(f1);
        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader fsr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(fsr);
        String line = new String();
        int readed = 0;
        
        while ((line = br.readLine()) != null) {
            readed ++;
        }

        /*while((asciiCode = br.read()) != -1) {
            readed += String.valueOf((char)asciiCode);
        }*/
        System.out.print(readed);

        fs.close();
        fis.close();
        fsr.close();
        br.close();
    }
}
