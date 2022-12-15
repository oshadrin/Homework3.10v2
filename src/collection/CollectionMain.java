package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

public class CollectionMain {
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.putMap();
        collection.printMap();
        collection.addValue("1", 19);
        collection.printMap();


        Map<Integer, String> resultMap = new LinkedHashMap<>();
        resultMap.put(1, "1");
        resultMap.put(2, "2");
        resultMap.put(4, "4");
        resultMap.put(5, "5");
        resultMap.put(7, "7");
        resultMap.put(6, "6");
        resultMap.put(3, "3");
        resultMap.put(8, "8");
        resultMap.put(9, "9");
        resultMap.put(10, "10");

        System.out.println(resultMap);
    }



}
