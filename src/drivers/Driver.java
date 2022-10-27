package drivers;

import transport.Abusers;
import transport.Transport;

public class Driver<T extends Transport & Abusers> {
    private String fullName;
    private String license;
    private int experience;

    private T car;

    public Driver(String fullName, String license, int experience, T car) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
        this.car = car;
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
        this.car = car;
    }
}
