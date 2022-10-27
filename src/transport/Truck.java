package transport;

public class Truck extends Transport {

    public Truck(String brand, String model, int engineCapasity) {
        super(brand, model, engineCapasity);
    }

    @Override
    public void startMovement() {
        System.out.println("Начало движения грузовика");
    }

    @Override
    public void stopMovement() {
        System.out.println("Остановка грузовика");
    }

    @Override
    public void pitStop() {
        System.out.println("Въезд на пит-стоп (грузовик)");
    }

    @Override
    public void bestTimeOfCircle() {
        System.out.println("Лучшее время круга (грузовик)");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость (грузовик)");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getEngineCapasity();
    }
}

