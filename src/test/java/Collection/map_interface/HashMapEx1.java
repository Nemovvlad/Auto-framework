package Collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        System.out.println(map1);
//        System.out.println(map1.get(1000));
        map1.remove(3568);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Mariya Sidorova"));
//        System.out.println(map1.containsKey(6578));
        System.out.println(map1.keySet());

    }
}
