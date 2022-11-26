package JavaForAdvanced;

import java.util.HashMap;
import java.util.Map;

public class Lesson6 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Maksim Vornik");
        map1.put(3543, "Zaur Tregulov");
        map1.put(5133, "Mariya Sidorova");
        map1.put(7435, "Nikolay Petrov");
        map1.put(1002130, "Nikolay Anisimov");
        System.out.println(map1);
        //System.out.println(map1.get(1000));


     //   System.out.println(map1);
       // System.out.println(map1.containsValue("Maksim Vornik"));
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        Map<String, String> map2 = new HashMap<>();
        map2.put("Max", "programmer");
        System.out.println(map2 );

    }
}
