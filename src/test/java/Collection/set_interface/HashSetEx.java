package Collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Varina");
        set.add("Igor");
//        System.out.println(set);
//        set.remove("Zaur");
        for (String s :set){
            System.out.println(s);
        }
        System.out.println(set.size());

    }
}
