package pasport;

import java.time.LocalDate;

public class PassportMain {
    public static void main(String[] args) {
        Passport passport1 = new Passport(191828,"Ivan", "Ivanov", "Ivanovich", LocalDate.of(1995, 12, 12));
        Passport passport2 = new Passport(121821,"Petrov", "Petr", "Petrovich", LocalDate.of(2001, 10, 25));
        PassportList passportList = new PassportList();
        passportList.addPassport(passport1);
        passportList.addPassport(passport2);
        System.out.println(passportList);
    }
}
