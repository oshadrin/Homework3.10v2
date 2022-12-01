package drivers;

import transport.Abusers;
import transport.Transport;

import java.util.Objects;

public class Driver<T extends Transport & Abusers> {
    private String fullName;
    private String license;
    private int experience;

    private T car;

    public Driver(String fullName, String license, int experience, T car) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
        setCar(car);
    }


    public void start() {

    }

    public void stop() {

    }

    public void fillUp() {

    }

    public void drive() {
        System.out.println("Водитель " + getFullName() + " управляет " + getCar() + " и учавствует в заезде");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String isLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        if(car == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.car = car;
    }

    @Override
    public String toString() {
        return getFullName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return fullName.equals(driver.fullName) && Objects.equals(license, driver.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
