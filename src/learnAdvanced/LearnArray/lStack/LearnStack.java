package learnAdvanced.LearnArray.lStack;

import java.util.Arrays;
import java.util.Stack;

/* 
 * Stack special operation 
 * It follows LIFO - Last In First Out.
 * Stack<Integer> st = new Stack<>();
 * st.push(integer);
 * st.pop() - remove object
 * st.peek() - show the last object
 * st.search(2) - not index , it is a value
 * st.empty()
 * 
 * It can work as vectors with same method
 * st.add(0,integer);
 * st.add(integer);
 * st.addAll(st1);
 * st.addAll(2,st1);
 * 
 */

public class LearnStack {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,2,4,34,56,9};
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        for (Integer integer : arr) {
            st.add(integer);
        }

        st1.push(65);
        st1.push(35);
        st1.push(45);
        st1.push(55);

        st.addAll(2, st1);
        
        System.out.println(st);
    }
} 
