package learnAdvanced.LearnArray.linkedList1;

import java.util.*;

public class Assignment1 {
    private Integer[] arrInt = new Integer[] {4,5,0,9,8,10};
    private LinkedList <Integer> ll = new LinkedList<>();
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();
    LinkedList<Integer> mergedLinkedList = new LinkedList<>();

    public Assignment1() {
        for (Integer i1: arrInt) {
            ll.add(i1);
        }
    }

    public static void main(String[] args) {
        Assignment1 ass1 = new Assignment1();

        ass1.sumEven();
        ass1.splitListLL();
        ass1.mergeArrLL();
    }

    public void mergeArrLL() {
        System.out.println("Before : " + mergedLinkedList);

        mergedLinkedList.addAll(list1);
        mergedLinkedList.addAll(list2);

        System.out.println("After : " + mergedLinkedList);

    }

    public void splitListLL() {
        int index = 0;

        for (int i2: ll) {
            if (index < ll.size()/2) {
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
        int res = 0;
        for (int integer : ll) {
            if (integer % 2 == 0) {
                res += integer;
            }
        }

        System.out.println("Sum of even number : " + res);
    }

    public void sumAndAvg() {
        int res = 0;
        for(int i2: ll) {
            res += i2;
        }

        System.out.printf("Sum : %d\nAverage : %d", res, res/ll.size());
    }
}
