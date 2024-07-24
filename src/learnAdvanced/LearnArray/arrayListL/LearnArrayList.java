package learnAdvanced.LearnArray.arrayListL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * ArrayList<Integer> arr = new ArrayList<>();
 * 
 * arr.add(87);
 * arr.add(1, 745);
 * arr1.addAll(arr2)
 * arr1.addAll(2,arr2);
 * 
 * arr1.size()
 * arr1.get(3)
 * 
 * arr1.indexOf(54)
 * 
 * arr1.remove(2)
 * 
 * arr1.isEmpty();
 * arr1.lastIndexOf(44);
 * arr1.clone();
 * arr1.contains(64);
 * arr1.contains(5879);
 * arr1.remove(arr1.lastIndexOf(44));
 * 
 * arr1.set(5, 54897);
 * 
 * arr1.removeAll(arr2);
 * arr1.clear();
 * 
 * Collections.synchronizedList(arr1); it make to work the arraylist as vector
 * ArrayList<Integer> arr2 = new ArrayList<>(50);
 * 
 */

public class LearnArrayList {
    public static void main(String[] args) {
        Object[] arr = new Object[] {23,54,64,44,48,44};
        ArrayList<Integer> arr1 = new ArrayList(Arrays.asList(arr));
        ArrayList<Integer> arr2 = new ArrayList<>(50);
        arr2.add(879);
        arr2.add(654);

        arr1.add(546);

        arr1.addAll(1, arr2);
        System.out.println(arr1);
        arr1.set(5, 54897);
        System.out.println(arr1);

        Collections.synchronizedList(arr1);
    }
}
