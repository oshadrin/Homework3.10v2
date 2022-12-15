package Collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionMain {
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.putMap();
        collection.printMap();
        collection.addValue("1", 19);
        collection.printMap();
    }

}
