package phoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PhoneBook {

    Map<FullName, String> phoneBook = new HashMap<>();


    public void addPhone(FullName fullName, String phone) {
         phoneBook.put(fullName, phone);
    }

    public Set<Map.Entry<FullName, String>> getEntries() {
        return phoneBook.entrySet();
    }

}
