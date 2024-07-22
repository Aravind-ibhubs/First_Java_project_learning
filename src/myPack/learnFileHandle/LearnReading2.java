package myPack.learnFileHandle;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class LearnReading2 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("./sample.text");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileInputStream fis = new FileInputStream(f1);
        String finalStr = new String();
        Scanner fs = new Scanner(fis);
        while (fs.hasNextLine()) {
            finalStr += fs.nextLine() + "\n";
        }
        System.out.println(finalStr);

        fis.close();
        fs.close();
    }
}
