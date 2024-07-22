package myPack.learnFileHandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LearningReading4 {
    public static void main(String[] args) throws IOException{
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileReader fs = new FileReader(f1);
        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader fsr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(fsr);
        String line = new String();
        String readed = new String();
        
        while ((line = br.readLine()) != null) {
            readed += line + "\n";
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
