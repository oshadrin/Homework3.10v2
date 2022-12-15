package Collection;

import java.util.HashMap;
import java.util.Map;

public class Collection {

    private Map<String, Integer> map = new HashMap<>();

    public void putMap() {
        map.put("1", 5);
        map.put("2", 6);
        map.put("3", 7);
        map.put("4", 8);
    }

    public void printMap() {
        System.out.println(map);
    }


    public void addValue(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueMap = map.get(key);
            if(valueMap == value) {
                throw new IllegalArgumentException("Такое значение уже есть в коллекции");
            } else {
                map.put(key, value);
            }
        }
    }
}
