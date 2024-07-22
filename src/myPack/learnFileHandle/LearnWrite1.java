package myPack.learnFileHandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearnWrite1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(f1);
        String sf = "Hello \nThis is aravind";

        for (char c: sf.toCharArray()) {
            fos.write(c);
        }
        /*
        fos.write(72);
        fos.write(69);
        fos.write(76);
        fos.write(76);
        */
        fos.flush();
        fos.close();
    }
}
