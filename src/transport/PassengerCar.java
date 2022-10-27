package transport;

import java.util.SortedMap;

public class PassengerCar extends Transport implements Abusers {

    public PassengerCar(String brand, String model, int engineCapasity) {
        super(brand, model, engineCapasity);
    }

    @Override
    public void startMovement() {
        System.out.println("Начало движения легкового автомобиля");
    }

    @Override
    public void stopMovement() {
        System.out.println("Остановка легкового автомобиля");
    }

    @Override
    public void pitStop() {
        System.out.println("Въезд на пит-стоп (легковой)");
    }

    @Override
    public void bestTimeOfCircle() {
        System.out.println("Лучшее время круга (легковой)");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость (легковой)");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getEngineCapasity();
    }
}
