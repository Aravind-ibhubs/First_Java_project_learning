package myPack.learnFileHandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class LearningWrite2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileWriter fw = new FileWriter(f1);
        String sf = "I am from Amalapuram \nWhat about u?";
        fw.write(sf.toCharArray());
        
        fw.flush();
        fw.close();
    }
} 
