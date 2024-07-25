package learnAdvanced.LearnArray.lStack;

import java.util.Stack;

public class Assignment1 {
    private Integer[] arrInt = new Integer[] {4,5,0,9,8,10};
    private Stack<Integer> st = new Stack<>();
    Stack<Integer> list1 = new Stack<>();
    Stack<Integer> list2 = new Stack<>();
    Stack<Integer> mergedStack = new Stack<>();

    public Assignment1() {
        for (int it: arrInt) {
            st.push(it);
        }
    }

    public static void main(String[] args) {
        Assignment1 ass1 = new Assignment1();
        
        ass1.sumOfEven();
        ass1.splitListS();
        ass1.mergeArrS();
    }

    public void mergeArrS() {
        System.out.println("Before : " + mergedStack);

        mergedStack.addAll(list1);
        mergedStack.addAll(list2);

        System.out.println("After : " + mergedStack);

    }

    public void splitListS() {
        int index = 0;

        for (int i2: st) {
            if (index < st.size()/2) {
                list1.push(i2);
            } else {
                list2.push(i2);
            }
            index ++;
        }

        System.out.printf("List 1 : " + list1 +"\nList 2 : " + list2);
        System.out.println();
    }

    public void sumOfEven() {
        int resEven = 0;

        for (int i2 : st) {
            if (i2 % 2 == 0) {
                resEven += i2;
            }
        }

        System.out.println("Sum of even number : " + resEven);
    }

    public void sumAndAverage() {
        int res = 0;
        for (int it: st) {
            res += it;
        }

        int sizeOfList = st.size();
        System.out.printf("Sum : %d\nAverage : %d", res, res/sizeOfList);
    }
}
