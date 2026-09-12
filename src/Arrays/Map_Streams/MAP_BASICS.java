package Arrays.Map_Streams;

import java.util.HashMap;
import java.util.Map;

public class MAP_BASICS {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        System.out.println("Map: " + map);
//        Print all keys
        System.out.println("Map: " + map.keySet());

//        Print all values
        System.out.println("Map: " + map.values());
//        Print all key-value pairs
        System.out.println("Map: " + map.entrySet());

//        Print entries where value > 50


//        Print entries where key starts with "A"
//        Count entries
//        Check whether key exists
//        Check whether value exists
//        Convert Map → List of values
//        Convert Map → List of keys
    }
}
