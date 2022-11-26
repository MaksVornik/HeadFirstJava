package JavaForAdvanced.set_interfaces;

import java.util.HashMap;
import java.util.Map;

public class Main123123 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One",5);
        map.put("Two",3);
        map.put("Three",2);
        System.out.println(getSumFromHasMap(map));
    }
    public static int getSumFromHasMap (Map<String, Integer> map) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum = sum + entry.getValue();
        }
        return sum;
    }
}
