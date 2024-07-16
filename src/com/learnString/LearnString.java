package com.learnString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LearnString {
    
    public static void main(String[] args) {
        /*String str1 = "Aravind";
        String str2 = "Kingedff@3r32@gmail.com";
        String str3 = new String("Aravind");
        String str4 = "Aravind";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 + str3);
        System.err.println(str1 == str3); // check the address. str1 is string pool. str3 is heap memory
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str3));
        */

        //Data manipulation
        String str5 = "HelLo";
        String str6 = " hello ";
        String str7 = "HELLO";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the world");
        String userInput1 = userInput.nextLine();

        /*System.out.println(str5.equals(str6));
        //System.out.println(str5.equalsIgnoreCase(str7));

        //System.out.println(str5.contains("L"));
        //System.out.println(str5.contains("u"));

        //System.out.println(str5.startsWith("He"));
        //System.out.println(str7.startsWith("h"));

        //System.out.println(str6.endsWith("lo"));

        //System.out.println(str6.length());
        System.out.println(str6.trim());
        System.out.println(str5.toLowerCase());
        System.out.println(str6.toUpperCase());

        char[] a = str6.toCharArray();
        System.out.println(str5.indexOf("l"));
        System.out.println(str5.lastIndexOf("8"));
        System.out.println(str7.lastIndexOf("l"));
        System.out.println(str5.substring(2));

        String str9 = "Hi how r u";
        System.out.println(str9.split(" "));
        System.out.println(Arrays.toString(str9.split(" ")));
        String st1Spl = "Hi^ how are ^ u ?";
        System.out.println(st1Spl.split("//^"));
        System.out.println(str5.charAt(2));
        System.out.println(str5.replace("o", "p"));
        System.out.println(str5.replace("how", "when"));

        String stInt = "908";
        int stNum = Integer.valueOf(stInt);

        int j = 7974;
        String jStr = String.valueOf(j);

        String b1;
        String b2 = "  ";
        String b3 = "";

        System.out.println(b2.length());
        System.out.println(b2.isEmpty());
        System.out.println(b3.isEmpty());

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the world");
        String stringInput = userInput.nextLine();

        System.out.println("Please the character for occurence");
        String strChar =  userInput.nextLine();

        int occurence = 0;
        String rev = new String();
        for (int i = 0; i < stringInput.length(); i++) {
            String presentChar = String.valueOf(stringInput.charAt(i));
            int latestIndex = stringInput.length()-1-i;
            rev += stringInput.charAt(latestIndex);

            if (presentChar.equals(strChar)) {
                occurence++;
            }
            //System.out.printf("loop %s char %s", presentChar, strChar);
            //System.out.println();
        }
        
        //System.out.println(rev);
        //System.out.println(stringInput.trim());
        String[] strList = stringInput.split(" ");
        String strRevList  = new String();

        for (String string : strList) {
            String rev1 = new String();
            for (int i=0; i < string.length(); i++) {
                rev1 += string.charAt(string.length() - 1- i);
            }
            strRevList += (rev1 + " ");
        }
        
        System.out.println(strRevList);
        

        // check the given string , convert to upper case when even otherwise reverse it.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the world");
        String stringInput = userInput.nextLine();

        String[] strList = stringInput.split(" ");

        String finalRes = new String();

        for(int i=0; i < strList.length; i++) {
            if (i%2 == 0) {
                finalRes += strList[i].toUpperCase();
            }
            else {
                String rev2 = new String();
                String currentString = strList[i];
                for (int j = 0; j < currentString.length(); j++) {
                    rev2 += currentString.charAt(currentString.length() -1- j);
                }
                finalRes += rev2;
            }
            finalRes += " ";
        }

        System.out.println(finalRes);

        //count the upper , lower case, number , spl char from given string
        int cap = 0;
        int low = 0;
        int spl = 0;
        int dig = 0;

        for (int i = 0; i < userInput1.length(); i++) {
            Character eachLetter = userInput1.charAt(i);
            
            if (Character.isDigit(eachLetter)) {
                dig++;
            }
            if (Character.isUpperCase(eachLetter)) {
                cap++;
            }
            if (Character.isLowerCase(eachLetter)) {
                low++;
            } 
            if (!Character.isLetterOrDigit(eachLetter)) {
                spl++;
            }
        }

        System.out.printf("Uppercase : %d \nLowerCase : %d \nNumber : %d \nSpecialCahracter : %d", cap, low,dig,spl);
        */

        // Find the first repeated char and non repeated char

        var j = 90;

        System.out.println(j);

        userInput.close();
    }
}
