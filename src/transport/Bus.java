package transport;
//
public class Bus extends Transport{
//
//
//    @Override
//    public void refill() {
//        if(getTypeOfFuel().equals("gas")){
//            System.out.println("Заправка автобуса бензином");
//        } else {
//            System.out.println("Заправка автобуса дизелем");
//        }
//
//    }
//
    public Bus(String brand,
               String model,
                int engineCapasity)
//               Integer productionYear,
//               String productionCountry,
//               String color,
//               String typeOfFuel)
    {
        super(brand,
               model,
//              productionYear,
                engineCapasity);

//                productionCountry,
//                color,
//                typeOfFuel);
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

