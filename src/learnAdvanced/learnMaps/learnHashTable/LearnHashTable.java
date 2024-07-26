package learnAdvanced.learnMaps.learnHashTable;

import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.*;

public class LearnHashTable {
    public static void main(String[] args) {
        List<Integer> arr = new Vector<>();

        //Create of maps
        Map <Integer, String> m1 = new Hashtable<>();
        Map <Integer, String> m2 = new Hashtable<>();

        //Adding element to map
        m1.put(4321, "Raghu");
        m1.put(4301, "Ram");
        m1.putIfAbsent(3202, "Ramesh");
        m1.putIfAbsent(4301, "Putin");

        m2.put(4098, "Raghu");
        m2.put(4678, "Ram");
        
        m1.putAll(m2);
        
        //updating the values
        m1.replace(4098, "Hyderabad");
        m1.put(4321, "Secundrabad");
        System.out.println(m1);

        //get the keys ,value
        Set<Integer> keys = m1.keySet();
        Collection<String> value = m1.values();
        
        /*for (int i1 : keys) {
            System.out.println(m1.get(i1));
        }*/

        // remove the values
        m1.remove(4321);
        // System.out.println(m1);
        m1.remove(4678, "Ram");
        // m1.clear();
        //m1.size();
        System.out.println(m1.size());

        //verification of keys
        //System.out.println(m1.containsKey(4098));
        //System.out.println(m1.containsKey(4678));
        //System.out.println(m1.containsValue("Ram"));
        //System.out.println(m1.containsValue("Mohan"));

        for (Map.Entry<Integer, String> entryOf : m1.entrySet()) {
            System.out.printf("Key is %d & value is %s \n", entryOf.getKey(), entryOf.getValue());
        }

    }
}
