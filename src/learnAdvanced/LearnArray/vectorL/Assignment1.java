package learnAdvanced.LearnArray.vectorL;

import java.util.*;;

public class Assignment1 {
    Object[] arr = new Object[] {4,5,0,9,8,10};
    Vector <Integer> v1 = new Vector(Arrays.asList(arr));
    Vector<Integer> list1 = new Vector<>();
    Vector<Integer> list2 = new Vector<>();
    Vector<Integer> mergedList = new Vector<>();

    public static void main(String[] args) {
        Assignment1 ass1 = new Assignment1();

        //ass1.sumEven();
        ass1.splitListV();
        ass1.mergeArrV();
    }

    public void mergeArrV() {
        System.out.println("Before : " + mergedList);

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("After : " + mergedList);

    }

    public void splitListV() {
        int index = 0;

        for (int i2: v1) {
            if (index < v1.size()/2) {
                list1.add(i2);
            } else {
                list2.add(i2);
            }
            index ++;
        }

        System.out.printf("List 1 : " + list1 +"\nList 2 : " + list2);
        System.out.println();
    }

    public void sumEven() {
        int sumEvenn = 0;
        for (int i2: v1){
            if (i2 % 2 == 0) {
                sumEvenn += i2;
            }
        }

        System.out.println(sumEvenn);
    }

    public void sumAndAvg() {
        int sumOfResult = 0;
        
        for (Integer integer : v1) {
            sumOfResult += integer;
        }

        System.out.printf("Sum : %d\nAverage : %d", sumOfResult, sumOfResult/v1.size());
    }
}
