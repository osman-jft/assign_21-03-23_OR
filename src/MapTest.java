//Define a class named MapTest

import java.util.HashMap;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        //add country names and their capitals as key value pairs,
        HashMap<String, String> map = new HashMap<>();

        // add some key-value pairs to the map
        map.put("United States of America", "Washington D.C.");
        map.put("India", "New Delhi");
        map.put("United Kingdom", "London");
        map.put("People's Republic Of China", "Beijing");
        map.put("Russian Federation", "Moscow");

        //  display all the key value pairs,

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " , " + value);
        }
        //Create a TreeMap and add the key-value pairs of the HashMap to it
        TreeMap<String, String> treeSet = new TreeMap<>(map);

        System.out.println("\n" +
                "TreeMap Print" +
                "\n");

//  and display them.
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " , " + value);
        }


    }
}

/**
 3. Define a class named MapTest, in the main method create a HashMap object,
 add country names and their capitals as key value pairs, display all the key value pairs,
 Create a TreeMap and add the key-value pairs of the HashMap to it and display them.
 **/