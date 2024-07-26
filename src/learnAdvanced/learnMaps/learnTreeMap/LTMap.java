package learnAdvanced.learnMaps.learnTreeMap;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class LTMap {
    public static void main(String[] args) {
        //Creation
        Map<String, Integer> tm = new TreeMap<>();
        TreeMap<String, Integer> tm1 = new TreeMap<>();

        //Adding values
        tm.put("Zero", 0);
        tm.putIfAbsent("One", 1);
        tm.putIfAbsent("Two", 2);
        // System.out.println(tm + " >> " + tm.size());
        tm1.put("Three", 3);
        tm1.putIfAbsent("Four", 4);
        tm1.putIfAbsent("Five", 5);
        tm1.putIfAbsent("Four", 4);
        tm1.putIfAbsent("One", 1);
        // System.out.println(tm1 + " >> " + tm1.size());
        tm.putAll(tm1);
        // System.out.println(tm + " >> " + tm.size());

        //Getting keys and values and entries
        Set<String> keyOfTM = tm.keySet();
        Collection<Integer> valueOfTM = tm.values(); 
        Set<Map.Entry<String, Integer>> tmEntry = tm.entrySet();

        // for(Map.Entry<String, Integer> loopEntry : tmEntry) {
        //     System.out.println(loopEntry.getValue() + " << " + loopEntry.getKey());
        // }

        // for (String str1: keyOfTM) {
        //     System.out.println(tm1.get(str1));
        // }

        //Updating of maps
        tm1.put("One" , 0);
        tm1.replace("Three", 2);
        // System.out.println(tm1.replace("Five", 5, 0));
        // System.out.println(tm1);

        // Verification
        // for (Map.Entry<String, Integer> loopEntry : tmEntry) {
        //     System.out.print(loopEntry.getKey() + " is in Map 2 : " + tm1.containsKey(loopEntry.getKey()) + " , ");
        //     System.err.print(loopEntry.getValue() + " is in Map 2 : " + tm1.containsValue(loopEntry.getValue()) + "\n");
        // }

        // Removing elements
        // System.out.println(tm);
        // tm.remove("Zero");
        // tm.remove("Two", 2);
        // System.err.println(tm);
        // tm.clear();
        // System.err.println(tm);
    }
}
