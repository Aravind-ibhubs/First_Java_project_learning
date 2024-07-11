package com.learnLoop.learnArray;

public class List1 {
    public static void main(String[] args) {
        String[] arr0 = {"coffee", "chai", "water", "diet coke" };
        int[] arr1 = {2,5,1,9,6};
        boolean[] arr2 = {true, false, false, true, false};

        // j =  {45,3,2,54,3}; not to do this.

        /*for(int i=0; i < j.length; ) {
            System.out.println(j[i]);
            i++;
        }*/
        String minString = arr0[0];
        int minLength = arr0[0].length();
        int minIndex = 0;

        int maxNum = arr1[0];
        int maxIndex = 0;

        for (int i=1; i < arr0.length; i++) {
            if (minLength > arr0[i].length()) {
                minString = arr0[i];
                minIndex = i;
                minLength = arr0[i].length();
            }
        }

        //System.out.printf("value - %s & index - %d" , minString, minIndex);

        for (int i=1; i < arr1.length; i++) {
            if (maxNum < arr1[i]) {
                maxNum = arr1[i];
                maxIndex = i;
            }
        }

        //System.out.printf("Value - %d and index - %d", maxNum, maxIndex);
        boolean[] finalArr3 = new boolean [5];
        for(int i=0; i<finalArr3.length; i++) {
            finalArr3[finalArr3.length - 1 - i] = arr2[i];
        }

        for(int i=0; i<finalArr3.length; i++) {
            System.out.println(finalArr3[i]);
        }
    }
}
