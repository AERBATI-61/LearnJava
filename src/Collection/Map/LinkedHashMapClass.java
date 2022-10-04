package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "First");
        linkedHashMap.put(2, "Second");
        linkedHashMap.put(3, "Third");

        linkedHashMap.putIfAbsent(2, "Second");
        linkedHashMap.putIfAbsent(4, "Forth");

        System.out.println(linkedHashMap);

        LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.put(10, "Ten");
        linkedHashMap1.putAll(linkedHashMap);
        System.out.println(linkedHashMap1);


        Set<Integer> keys = linkedHashMap1.keySet();
        for(Integer key: keys){
            System.out.println(key+ " " + linkedHashMap1.get(key));
        }

        boolean key = linkedHashMap1.containsKey(1);
        boolean value = linkedHashMap1.containsValue("Firstt");
        System.out.println(key);
        System.out.println(value);

    }

}
