package pasport;

import java.util.HashSet;
import java.util.Set;

public class PassportList {

    private final Set<Passport> passportSet = new HashSet<>();

    public void addPassport(Passport passport) {
        this.passportSet.add(passport);
    }

    public Passport findPassport(int passportNumber) {
        for (Passport passport : passportSet) {
            if (passport.getPassportNumber() == passportNumber) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Список паспортов: \n" + passportSet;
    }
}
