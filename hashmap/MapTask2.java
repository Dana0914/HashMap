package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapTask2 {
    public static void main(String[] args) {
        Integer max = 0;
        Map<String, Integer> cityCount = new HashMap<>();
        cityCount.put("Moscow", 12400);
        cityCount.put("Astana", 5700);
        cityCount.put("Kiev", 3200);
        cityCount.put("Almaty", 1500);
        for (Map.Entry<String, Integer> entry : cityCount.entrySet()) {
            Integer value = entry.getValue();
            if (value > max) {
                max = value;
                String key = entry.getKey();
                System.out.println(max + " " + key);
            }

        }
    }
}
