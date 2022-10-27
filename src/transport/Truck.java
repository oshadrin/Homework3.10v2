package transport;

public class Truck extends Transport {

    private Capacity capacity;
    private LoadCapacity loadCapacity;
    private BodyType bodyType;

    public Truck(String brand, String model, Integer productionYear, String productionCountry, String color, String typeOfFuel, Capacity capacity, LoadCapacity loadCapacity, BodyType bodyType) {
        super(brand, model, productionYear, productionCountry, color, typeOfFuel);
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public BodyType getBodyType() {
        return bodyType;
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
    public void printType() {
        if(loadCapacity == null){
            System.out.println("Необходимо указать данные по авто");
        } else {
            System.out.println("Тип авто: " + loadCapacity);
        }
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

    @Override
    public void refill() {
        if (getTypeOfFuel().equals("gas")){
            System.out.println("Заправка бензином");
        } else {
            System.out.println("Зарядка электромобиля");
        }
    }
}

