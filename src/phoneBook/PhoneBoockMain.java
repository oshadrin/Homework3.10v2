package phoneBook;

import java.util.Map;

public class PhoneBoockMain {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhone(new FullName("Test1"), "89219897824");
        phoneBook.addPhone(new FullName("Test2"), "89219897833");
        phoneBook.addPhone(new FullName("Test3"), "89219897323");
        phoneBook.addPhone(new FullName("Test4"), "89319897823");
        phoneBook.addPhone(new FullName("Test5"), "89219897323");
        phoneBook.addPhone(new FullName("Test6"), "89219897853");
        phoneBook.addPhone(new FullName("Test7"), "89219897825");
        phoneBook.addPhone(new FullName("Test8"), "89219895823");
        phoneBook.addPhone(new FullName("Test9"), "89219857823");
        phoneBook.addPhone(new FullName("Test10"), "89219497823");
        phoneBook.addPhone(new FullName("Test11"), "89214897823");
        phoneBook.addPhone(new FullName("Test12"), "89249897823");
        phoneBook.addPhone(new FullName("Test13"), "89419897823");
        phoneBook.addPhone(new FullName("Test714"), "89219899823");
        phoneBook.addPhone(new FullName("Test15"), "89219897893");
        phoneBook.addPhone(new FullName("Test16"), "89219897829");
        phoneBook.addPhone(new FullName("Test17"), "89219897820");
        phoneBook.addPhone(new FullName("Test18"), "89219897803");
        phoneBook.addPhone(new FullName("Test19"), "89219897023");
        phoneBook.addPhone(new FullName("Test20"), "89219807823");

        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
    }
}
