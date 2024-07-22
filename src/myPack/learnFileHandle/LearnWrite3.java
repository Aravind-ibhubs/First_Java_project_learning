package myPack.learnFileHandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class LearnWrite3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader fsr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(fsr);
        String line = new String();
        String readed = new String();
        
        while ((line = br.readLine()) != null) {
            readed += line + "\n";
        }

        String sf = readed + "\n" + "I am worked as a AS  \nI am a king hacker.";
        BufferedWriter bmw = new BufferedWriter(new FileWriter(f1));
        bmw.write(sf);

        fis.close();
        fsr.close();
        br.close();
        bmw.flush();
        bmw.close();
    }
}
