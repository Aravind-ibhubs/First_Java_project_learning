package learnAdvanced.learnMaps.learnHashMap;

import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter;
import javax.swing.RowFilter.Entry;

import java.util.*;

public class LHashMap {
    public static void main(String[] args) {
        //Creation of Hash map
        Map<String,Object> hm = new HashMap<>();
        Map<String,Object> hm1 = new HashMap<>();

        //Adding the variables
        hm.put("ID1", 890);
        hm.put("Name_890", "Amreesh");
        hm.put("Age_890", 102);
        hm.put("Income_890", 5623.12);

        hm1.put("ID2", 80);
        hm1.putIfAbsent("Name_80", "Poori");
        hm1.putIfAbsent("Age_80", 98.1);
        hm1.put("Income_890", 56000.12);

        hm.putAll(hm1);

        //Size of map
        hm.size();

        System.out.println(hm);
        //Update the values
        hm.put("ID2", 32);
        hm.replace("Age_80", 864);
        // System.out.println(hm.replace("Income_890", 56000.12, 478562));
        // System.out.println(hm.replace("Income_89", 56000.12, 478562));
        
        // retrieve the value, keys and entries
        Collection<String> keyOfHM = hm.keySet();
        Collection<Object> valueOfHM = hm.values();
        //System.out.println(keyOfHM + " >>> " + valueOfHM);

        //Verification
        // for (String key : keyOfHM) {
        //     boolean valuesIsPresent = hm.containsValue(hm.get(key));
        //     boolean keyIsPresent = hm.containsKey(key);
        //     System.out.println(keyIsPresent + " >> " + valuesIsPresent);
        // }

        // Entrys in map
        //for (Map.Entry<String, Object> hmEntry : hm.entrySet()) {
        //    System.out.println("Entry of Key : " + hmEntry.getKey() + " - Value : " + hmEntry.getValue());
        //    System.out.println(hmEntry.hashCode());
        //}

        hm.remove("Name_80");
        hm.remove("Age_890", 102);
        //System.out.println(hm);
        //hm.clear();
        //System.out.println(hm);

    }
}
