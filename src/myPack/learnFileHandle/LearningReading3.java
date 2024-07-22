package myPack.learnFileHandle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LearningReading3 {

    public static void main(String[] args) throws IOException{
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        } 
        
        FileReader fr = new FileReader(f1);

        int asciiCode;
        String readed = new String();
        while((asciiCode = fr.read()) != -1) {
            readed += String.valueOf((char)asciiCode);
        }
        System.out.println(readed);
        fr.close();
    }

}
