package JavaForAdvanced.set_interfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        System.out.println(set.size());
        for (String s:set) {
            System.out.println(s);
        }
    }
}
