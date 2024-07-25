package learnAdvanced.LearnArray.arrayListL;

import java.util.*;

public class Assignment1 {
    private Object[] arr = new Object[] {4,5,0,9,8,10};
    private ArrayList<Integer> arr1 = new ArrayList(Arrays.asList(arr));
    private int resOfSum = 0;

    public static void main(String[] args) {
        Assignment1 assLL = new Assignment1();

        assLL.sumEvenLL();
        assLL.splitListAl();
    }

    public void splitListAl() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int index = 0;

        for (int i2: arr1) {
            if (index < arr1.size()/2) {
                list1.add(i2);
            } else {
                list2.add(i2);
            }
            index ++;
        }

        System.out.printf("List 1 : " + list1 +"\nList 2 : " + list2);
    }

    public void sumEvenLL() {
        for (int i2: arr1) {
            if (i2 % 2 == 0) {
                resOfSum += i2;
            }
        }

        System.out.println("Sum of even number : "+ resOfSum);
    }

    public void sumAndAvgLL() {
        resOfSum = 0;
        for(Integer i: arr1) {
            resOfSum += i;
        }

        System.out.printf("Sum : %d\nAverage : %d", resOfSum, resOfSum/arr1.size());
    }
}
