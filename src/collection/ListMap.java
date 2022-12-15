package collection;


import java.util.*;

public class ListMap {
    private final Map<String, List<Integer>> listMap = new HashMap<>();
    private static final Random RANDOM = new Random();

    public ListMap() {
        for (int i = 0; i < 5; i++) {
            listMap.put(String.valueOf(i), list3());
        }
    }
    public Set<Map.Entry<String, List<Integer>>> getOriginalMap() {
        return listMap.entrySet();
    }

    public Map<String, Integer> getMap() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            int sum = 0;
            for(Integer number: entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }

    private List<Integer> list3 () {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt(1001));
        }
        return list;
    }
}
