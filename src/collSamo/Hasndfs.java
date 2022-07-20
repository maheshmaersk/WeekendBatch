package collSamo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hasndfs {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        TreeMap<String, String> map = new TreeMap<>();
        map.put("EU", "Europe");
        map.put("IN", "India");
        map.put("UK", "United Kingdom");
        map.put("US", "United States");
        map.put("INS", "Indonasis");
        map.put("WI", "Jamica");

        System.out.println(map);
    }
}
