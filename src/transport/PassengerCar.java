package transport;

import java.util.SortedMap;

public class PassengerCar extends Transport implements Abusers {

    public PassengerCar(String brand, String model, Integer productionYear, String productionCountry, String color, String typeOfFuel, BodyType bodyType) {
        super(brand, model, productionYear, productionCountry, color, typeOfFuel);
        this.bodyType = bodyType;
    }
    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
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
    public void printType() {
        if(bodyType == null){
            System.out.println("Необходимо указать данные по авто");
        } else {
            System.out.println("Тип авто: " + bodyType);
        }
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

    @Override
    public void refill() {
        if (getTypeOfFuel().equals("gas")){
            System.out.println("Заправка бензином");
        } else {
            System.out.println("Зарядка электромобиля");
        }
    }
    @Override
    public boolean doCheckCar() {
        System.out.println("Легковой автомобиль " + getBrand() + " проходит диагностику");
        return true;
    }
}
