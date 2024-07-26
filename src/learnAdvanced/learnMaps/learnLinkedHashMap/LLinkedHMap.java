package learnAdvanced.learnMaps.learnLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class LLinkedHMap {
    public static void main(String[] args) {
        //Creation
        Map<String, Integer> lhm = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<>();

        //Adding values
        lhm.put("Zero", 0);
        lhm.putIfAbsent("One", 1);
        lhm.putIfAbsent("Two", 2);
        // System.out.println(lhm + " >> " + lhm.size());
        lhm1.put("Three", 3);
        lhm1.putIfAbsent("Four", 4);
        lhm1.putIfAbsent("Five", 5);
        lhm1.putIfAbsent("Four", 4);
        lhm1.putIfAbsent("One", 1);
        //System.out.println(lhm1 + " >> " + lhm1.size());
        lhm.putAll(lhm1);
        //System.out.println(lhm + " >> " + lhm.size());

        //Getting keys and values and entries
        Set<String> keyOfLHM = lhm.keySet();
        Collection<Integer> valueOfLHM = lhm.values(); 
        Set<Map.Entry<String, Integer>> lhmEntry = lhm.entrySet();

        //for(Map.Entry<String, Integer> loopEntry : lhmEntry) {
            //System.out.println(loopEntry.getValue() + " << " + loopEntry.getKey());
        //}

        //for (String str1: keyOfLHM) {
            //System.out.println(lhm1.get(str1));
        //}

        //Updating of maps
        lhm1.put("One" , 0);
        lhm1.replace("Three", 2);
        //System.out.println(lhm1.replace("Five", 5, 0));

        //Verification
        // for (Map.Entry<String, Integer> loopEntry : lhmEntry) {
        //     System.out.print(loopEntry.getKey() + " is in Map 2 : " + lhm1.containsKey(loopEntry.getKey()) + " , ");
        //     System.err.print(loopEntry.getValue() + " is in Map 2 : " + lhm1.containsValue(loopEntry.getValue()) + "\n");
        // }

        // Removing elements
        // System.out.println(lhm);
        // lhm.remove("Zero");
        // lhm.remove("Two", 2);
        // lhm.clear();
        // System.err.println(lhm);
    }
}
