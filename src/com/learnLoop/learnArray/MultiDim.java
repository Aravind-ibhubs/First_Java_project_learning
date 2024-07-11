package com.learnLoop.learnArray;

public class MultiDim {
    public static void main(String[] args) {
        int[][] mdArr1 = new int[][] {
            {1,2,1},
            {9,7,2},
            {7,6,4}
        };
        int[][] jArr1 = new int[][] {
            {2,6,8},
            {0,1,3},
            {1,2,4}
        };

        int[][] resArr = new int[3][3];

        /*jArr1 = new int[][] {
            {1,2},
            {43,76,23,45,65},
            {453,564,6}
        };

        jArr1[0] = new int[] {1,2};
        jArr1[1] = new int[] {23,45,65,65};
        jArr1[2] = new int[] {342,534, 8};

        int[][] mdArr1 = new int[][] {
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] mdArr1 = {
            {1,2},
            {3,4},
            {5,6}
        };

        mdArr1[0] = new int[] {1,2};
        mdArr1[1] = new int[] {3,4};
        mdArr1[2] = new int[] {5,6};

        mdArr1[0][0] = 1;
        mdArr1[0][1] = 2;

        mdArr1[1][0] = 3;
        mdArr1[1][1] = 4;

        mdArr1[2][0] = 5;
        mdArr1[2][1] = 6;

        int sizeArr = 0;
        for (int i=0; i < mdArr1.length; i++) {
            sizeArr += mdArr1[i].length;
        }
        System.out.println(sizeArr);
        

        for (int i=0; i < mdArr1.length; i++) {
            for (int j=0;j< mdArr1[i].length;j++ ) {
                resArr[i][j] = mdArr1[i][j] + jArr1[i][j];
            }
        }*/
        
        for (int i=0; i < resArr.length; i++) {
            for (int j=0; j < resArr[i].length; j++) {
                resArr[j][i] = mdArr1[i][j];   
            }
        }

        for (int i=0; i < resArr.length; i++) {
            for (int j=0;j< resArr[i].length;j++ ) {
                System.out.print(resArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
