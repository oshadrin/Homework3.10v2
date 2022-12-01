package pasport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private int passportNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate dateOfBirthday;

    public Passport(int passportNumber, String firstName, String lastName, String middleName, LocalDate dateOfBirthday) {
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public String toString() {
        return "\n" + passportNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }
}
