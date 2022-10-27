package drivers;

import transport.Truck;

public class CategoryC extends Driver<Truck>{

    public CategoryC(String fullName, String license, int experience, Truck car) {
        super(fullName, license, experience, car);
    }


}
