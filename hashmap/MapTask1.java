package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) {
        Map<String, Integer> cityCount = new HashMap<>();
        cityCount.put("Moscow", 12400);
        cityCount.put("Astana", 1300);
        cityCount.put("Kiev", 5700);
        cityCount.put("Almaty", 2200);
        for (Map.Entry<String, Integer> entry : cityCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 5000) {
                System.out.println(key + " " + value);
            }
        }
    }
}
