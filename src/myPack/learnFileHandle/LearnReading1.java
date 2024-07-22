package myPack.learnFileHandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LearnReading1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        }
        FileInputStream fis = new FileInputStream(f1);

        int asciiCode;
        String readed = new String();
        while((asciiCode = fis.read()) != -1) {
            readed += String.valueOf((char)asciiCode);
        }
        System.out.println(readed);
        fis.close();
    }
}
