package drivers;

import transport.PassengerCar;

public class CategoryB extends Driver <PassengerCar> {

    public CategoryB(String fullName, String license, int experience, PassengerCar car) {
        super(fullName, license, experience, car);
    }
}
