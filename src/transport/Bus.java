package transport;

public class Bus extends Transport{

    private Capacity capacity;
    private LoadCapacity loadCapacity;
    private BodyType bodyType;


    @Override
    public void refill() {
        if(getTypeOfFuel().equals("gas")){
            System.out.println("Заправка автобуса бензином");
        } else {
            System.out.println("Заправка автобуса дизелем");
        }

    }

    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, String typeOfFuel, Capacity capacity, LoadCapacity loadCapacity, BodyType bodyType) {
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
        System.out.println("Начало движения автобуса");
    }

    @Override
    public void stopMovement() {
        System.out.println("Остановка автобуса");
    }

    @Override
    public void printType() {
        if(capacity == null){
            System.out.println("Необходимо указать данные по авто");
        } else {
            System.out.println("Вместимость от :" + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Въезд на пит-стоп (автобус)");
    }

    @Override
    public void bestTimeOfCircle() {
        System.out.println("Лучшее время круга (автобус)");
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

