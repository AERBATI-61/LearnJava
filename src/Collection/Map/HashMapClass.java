package Collection.Map;

import java.util.HashMap;
import java.util.Set;


public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCars = new HashMap<>();
        hashMapCars.put("Jeep", "USA");

        hashMapCars.put("GMC", "USA");
        hashMapCars.put("GMC", "East Turkistan");

        hashMapCars.put("USA", "USA");
        String valueOfJeep = hashMapCars.get("Jeep");
        hashMapCars.putIfAbsent("USA", "Amareca");

        boolean inSide = hashMapCars.containsValue("USA");
        System.out.println(inSide);

        System.out.println(hashMapCars);
        System.out.println("valueOfJeep: " + valueOfJeep);

        Set<String> keys = hashMapCars.keySet();
        for (String key : keys) {
            System.out.println(key + " " + hashMapCars.get(key));
        }










    }
}
