package learnAdvanced.LearnArray.vectorL;

import java.lang.reflect.Array;
import java.util. *;

/*
 * add = v1.add(number)
 *  v1.add(5, null);
 * v1.addAll(v2);
 * v1.addAll(11, v3);
 * v1.capacity()
 * v1.size()
 * v1.get(0)
 * v1.set(2, 8754);
 * v1.remove(2);
 * v1.removeAll(v3);
 * v1.contains(854)
 * v1.containsAll(v3)
 * v1.indexOf(74856)
 * v1.indexOf(null, 3)
 * v1.isEmpty();
 * System.out.println(v1.firstElement());
 * System.out.println(v1.lastElement());
 * v1.clear();
 * 
 * Convert to array
 * Object[] arr = v4.toArray();
 * System.out.println(Arrays.toString(arr));
 * 
 * Vector<Integer> v1 = new Vector<>(20);
 * 
 * Object[] arr = new Object[] {12, 54, 87, 64,35};
 * Vector<Integer> v1 = new Vector(Arrays.asList(arr));
 * 
 */

public class LearnVector {
    public static void main(String[] args) {
        Object[] arr = new Object[] {12, 54, 87, 64,35};
        Vector<Integer> v1 = new Vector(Arrays.asList(arr));

        //v1.add(12);
        //1.add(84);
        //v1.add(97);
        /*
        v1.add(9);
        v1.add(null);
        v1.add(null);
        v1.add(55);
        v1.add(10);
        v1.add(87);
        v1.add(2, 54);
        v1.add(2, 84);
        v1.add(2, 63);
        v1.add(5, null); 

        //System.out.println("Vector : "+ v1 + "Before v2 addition.\n" + "capacity : " + v1.capacity() + "\n size : " + v1.size());
        
        Vector<Integer> v2 = new Vector<>();
        v2.add(99);
        v2.add(96);
        v2.add(7);
        
        v1.addAll(v2);
        //System.out.println("Vector : "+ v1 + "Before v2 addition without index.\n"  + "capacity : " + v1.capacity() + "\n size : " + v1.size());

        Vector<Integer> v3 = new Vector<>();
        v3.add(99);
        v3.add(98);
        v3.add(97);
        v3.add(1, 96);
        //System.out.println(v3);

        v1.addAll(11, v3);
        //System.out.println("Vector : "+ v1 + "Before v3 addition with index.\n"  + "capacity : " + v1.capacity() + "\n size : " + v1.size());

        //v1.remove(2);
        v1.removeAll(v3);
        //System.out.println(v1);
        //System.out.println(v1.isEmpty());
        //System.out.println(v1.firstElement());
        //System.out.println(v1.lastElement());
        //v1.clear();
        //System.out.println(v1);

        Vector <String> v4 = new Vector<>();
        v4.add("Ram");
        v4.add("Mahi");
        v4.add("imhran");
        v4.add("sudha");
        v4.add("venkamma");
        v4.add("Ravanamma");

        Object[] arr = v4.toArray();
        System.out.println(Arrays.toString(arr));
         */
        System.out.println(v1.capacity());
        System.out.println(v1.size());

    }
}
