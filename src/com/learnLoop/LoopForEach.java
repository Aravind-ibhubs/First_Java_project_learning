package com.learnLoop;

public class LoopForEach {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,54,43,2,22};
        int[][] arr2 = {
            {23,45,34},
            {54,21,43},
            {43,76,98}
        };

        int[][] arr3 = {
            {12,34,23,56,45},
            {34,56,32},
            {34,32,56,78,90,87,67}
        };

        int sumSingleDim = 0;
        for(int val: arr1) {
            sumSingleDim += val;
        }

        //System.out.println(sumSingleDim);
        // System.out.println(sumSingleDim / arr1.length);

        int sumTwoDim = 0;
        int lengthTwoDim = 0;
        for (int[] val : arr3) {
            for (int value : val) {
                sumTwoDim += value;
                lengthTwoDim ++;
            }
        }

        System.out.println(sumTwoDim);
        System.out.println(sumTwoDim / lengthTwoDim);

    }
}
