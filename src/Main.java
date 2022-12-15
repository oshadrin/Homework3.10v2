//import animals.Amphibians;
//import animals.birds.Birds;
//import animals.birds.Flightless;
//import animals.birds.Flying;
//import animals.mammals.Herbivores;
//import animals.mammals.Mammals;
//import animals.mammals.Predators;
//import transport.Car;
//import transport.Transport;
//
//import java.time.LocalDate;
//import java.util.Date;

import drivers.CategoryB;
import drivers.CategoryC;
import drivers.CategoryD;
import drivers.Driver;
import login.Data;
import transport.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Bus[] bus = new Bus[4];
        Bus huge = new Bus("Man", "1212", 220, "USA", "black", "gas", Capacity.VARY_SMALL);
        Bus big = new Bus("Scania", "1212", 220, "Germany", "black", "gas", Capacity.VERY_LARGE);;
        Bus middle = new Bus("Mercedes", "1212", 220, "Germany", "black", "gas", Capacity.VARY_SMALL);;
        Bus small = new Bus("Ford", "1212", 220, "USA", "black", "gas", Capacity.MEDIUM);;
        bus[0] = huge;
        bus[1] = big;
        bus[2] = middle;
        bus[3] = small;



        Truck[] truck = new Truck[4];
        Truck one = new Truck("Volvo", "AM21", 350, "Germany", "white", "gas", LoadCapacity.N1);
        Truck two = new Truck("Volvo", "GGR", 333, "Germany", "white", "gas", LoadCapacity.N2);
        Truck three = new Truck("Mercedes", "AM21", 350, "Germany", "yellow", "gas", LoadCapacity.N1);
        Truck four = new Truck("Kamaz", "L2", 350, "Russia", "green", "gas", LoadCapacity.N3);
        truck[0] = one;
        truck[1] = two;
        truck[2] = three;
        truck[3] = four;


        PassengerCar[] passengerCar = new PassengerCar[4];
        PassengerCar black = new PassengerCar("Ford", "AM21", 120, "USA", "white", "gas", BodyType.SEDAN);
        PassengerCar red = new PassengerCar("MiniCopper", "3343", 320, "Germany", "white", "gas", BodyType.SEDAN);
        PassengerCar white = new PassengerCar("Mazda", "FHJ", 350, "Japan", "white", "gas", BodyType.CROSSOVER);
        PassengerCar silver = new PassengerCar("Lada", "Largus", 350, "Russia", "white", "gas", BodyType.HATCHBACK);
        passengerCar[0] = black;
        passengerCar[1] = red;
        passengerCar[2] = white;
        passengerCar[3] = silver;

        Set<Transport> transports = new HashSet<>();
        for (int i = 0; i < passengerCar.length; i++) {
            transports.add(passengerCar[i]);
        }
        for (int i = 0; i < bus.length; i++) {
            transports.add(bus[i]);
        }
        for (int i = 0; i < truck.length; i++) {
            transports.add(truck[i]);
        }
        System.out.println("Коллекция с транспортом: " + transports);



        four.pitStop();
        white.bestTimeOfCircle();
        small.maxSpeed();

        printTransport(bus, truck, passengerCar);

        CategoryB ivan = new CategoryB("Ivanov Ivan Ivanovich", "B", 12, black);
        CategoryC petr = new CategoryC("Petrov Petr Petrovich", "C", 22, four);
        CategoryC max = new CategoryC("Petrov Maksim Petrovich", "C", 22, four);
        CategoryD alex = new CategoryD("Alekseev Aleksey Alexeevich", "D", 14, middle);

        ivan.drive();

//task1 Исключения------------------------------------------------------------------------------------------------------
        boolean success=  Data.checkInput("login", "pass123", "pass123");
        if (success) {
            System.out.println("Login/pass: Данные введены правильно");
        } else {
            System.out.println("Login/pass: Данные введены неверно");
        }
//task1 Исключения------------------------------------------------------------------------------------------------------
//task2 Исключения------------------------------------------------------------------------------------------------------
        doCheckCar(bus, truck, passengerCar);
//task2 Исключения------------------------------------------------------------------------------------------------------
// Коллекции Введение Листы Очереди--------------------------------------------------------------------------------

        Sponsors gasprom = new Sponsors("Газпром", 1000000);
        Sponsors tinkof = new Sponsors("Тинькоф", 500000);
        Sponsors potanin = new Sponsors("Потанин", 800000);
        Sponsors baltika = new Sponsors("Балтика", 4000000);

        Mechanic vasya = new Mechanic("Вася", "Пупкин", "Ремонт", "Пассажирские");
        Mechanic vanya = new Mechanic("Ваня", "Петров", "Ремонт", "Пассажирские");
        Mechanic yura = new Mechanic("Юра", "Сидоров", "Ремонт", "Грузовые");
        Mechanic vasya2 = new Mechanic("Вася", "Соколов", "Ремонт", "Грузовые");
        Mechanic petya = new Mechanic("Петр", "Ефимов", "Ремонт", "Автобусы");
        Mechanic masha = new Mechanic("Маша", "Соколова", "Ремонт", "Автобусы");



        black.addSponsor(gasprom);
        black.addSponsor(potanin);
        black.addDriver(petr);
        black.addMechanic(vanya);
        black.addMechanic(vasya);

        red.addSponsor(tinkof);
        red.addSponsor(baltika);
        red.addSponsor(potanin);
        red.addDriver(max);
        red.addMechanic(vanya);
        red.addMechanic(vasya);


        black.carInfo();
        red.carInfo();

        ServiceStation serviceStation = new ServiceStation();




        serviceStation.addPassengerCar(black);
        serviceStation.addPassengerCar(red);

        serviceStation.addTruck(one);
        serviceStation.addTruck(two);
        serviceStation.service();

        Store store = new Store();
        store.addPeople();
        store.printQueues();

        String name = "новый покупатель";
        store.addBuyer(name);
        store.removeBuyer();

        Chess.example();

        }

//Коллекции Введение Листы Очереди--------------------------------------------------------------------------------


//        Flower[] arr = new Flower[4];
//        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
//        Flower chrysanthemum = new Flower("Хризантемма", null, null, 15, 5);
//        Flower peony = new Flower("Пион", null, null, 69.9, 1);
//        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
//        arr[0] = rose;
//        arr[1] = chrysanthemum;
//        arr[2] = peony;
//        arr[3] = gypsophila;
//        calculateValue(arr);
//
//
//        Car[] arr2 = new Car[2];
//        Car bmw = new Car("black", "hand", "H912PC777", true, "bmw", "xd520", 2020, "Germany", "sedan", 5, "gas");
//        Car audi = new Car("white", "automatic", "C223PC177", false, "audi", "rx", 2021, "Germany", "sedan", 5, "electric");
//        arr2[0] = bmw;
//        arr2[1] = audi;
//        bmw.changeTires();
//        audi.changeTires();
//        bmw.checkNumber();
//        audi.checkNumber();
//        bmw.refill();
//        audi.refill();
//        Car.Insurance insurance = new Car.Insurance(LocalDate.of(2022, 10, 1), 10500, "928398276");
//        bmw.setInsurance(insurance);
//
//        Flying[] flying = new Flying[3];
//        Flying seagull = new Flying("Max", "2", "sea", "wings");
//        Flying albatross = new Flying("Ivan", "6", "like", "wings");
//        Flying falcon = new Flying("Stepan", "13", "rocks", "wings");
//        flying[0] = seagull;
//        flying[1] = albatross;
//        flying[2] = falcon;
//
//
//        Flightless[] flightless = new Flightless[3];
//        Flightless peackoc = new Flightless("Vova", "11", "different", "paw");
//        Flightless penguin = new Flightless("Vova", "11", "different", "paw");
//        Flightless dodo = new Flightless("Alexey", "4", "antarctica", "paw");
//        flightless[0] = peackoc;
//        flightless[1] = penguin;
//        flightless[2] = dodo;
//
//        Amphibians[] amphibians = new Amphibians[2];
//        Amphibians frog = new Amphibians("Gosha", "3", "like");
//        Amphibians snake = new Amphibians("Pasha", "1", "river");
//        amphibians[0] = frog;
//        amphibians[1] = snake;
//
//        Predators[] predators = new Predators[3];
//        Predators hyena = new Predators("Masha", "2", "forest", "55", "meat");
//        Predators tiger = new Predators("Katya", "2", "forest", "66", "meat");
//        Predators bear = new Predators("Kostya", "3", "forest", "66", "everything");
//        predators[0] = hyena;
//        predators[1] = tiger;
//        predators[2] = bear;
//
//        Herbivores[] herbivores = new Herbivores[3];
//        Herbivores gazelle = new Herbivores("Jane", "12", "grassland", "54", "grass");
//        Herbivores giraffe = new Herbivores("Martin", "10", "grassland", "34", "grass");
//        Herbivores horse = new Herbivores("Kon", "8", "grassland", "51", "grass");
//        herbivores[0] = gazelle;
//        herbivores[1] = giraffe;
//        herbivores[2] = horse;
//
//
//        System.out.println("Травоядные:");
//        for (int i = 0; i < herbivores.length; i++) {
//            System.out.println(herbivores[i]);
//        }
//        System.out.println("Хищники:");
//        for (int i = 0; i < predators.length; i++) {
//            System.out.println(predators[i]);
//        }
//        System.out.println("Земноводные:");
//        for (int i = 0; i < amphibians.length; i++) {
//            System.out.println(amphibians[i]);
//        }
//        System.out.println("Летающие птицы:");
//        for (int i = 0; i < flying.length; i++) {
//            System.out.println(flying[i]);
//        }
//        System.out.println("Нелетающие птицы:");
//        for (int i = 0; i < flightless.length; i++) {
//            System.out.println(flightless[i]);
//        }
//
//        unicHerbivores(herbivores);
//    }

//    public static void unicHerbivores(Herbivores[] herbivores) {
//
//        for (int i = 0; i < herbivores.length; i++) {
//            for (int j = i + 1; j < herbivores.length; j++) {
//                if (herbivores[i] == herbivores[j]) {
//                    System.out.println("Травоядные" + herbivores[i] + " и " + herbivores[j] + " не уникальны");
//                }
//            }
//        }
//    }
//
//            @Override
//            public String toString () {
//                return super.toString();
//            }
//
//            public static void calculateValue (Flower arr[]){
//                String composition = "Букет содержит: \n";
//                int lifeSpan = Integer.MAX_VALUE;
//                double value = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    composition += arr[i].getName() + " из " + arr[i].getCountry() + "\n";
//                    if (arr[i] != null || arr[i].getLifeSpan() < lifeSpan) {
//                        lifeSpan = arr[i].getLifeSpan();
//                    }
//                    value += arr[i].getCost();
//                }
//                value = value * 1.1;
//                composition += "\nСумма букета = " + String.format(" %.2f ", value, "\n");
//                composition += "Срок годности " + lifeSpan + " дней";
//                System.out.println(composition);
//            }

    public static void printTransport(Bus[] bus, Truck[] track, PassengerCar[] passengerCars) {
        for (int i = 0; i < bus.length; i++) {
            System.out.println(bus[i]);
            bus[i].printType();
        }
        for (int i = 0; i < track.length; i++) {
            System.out.println(track[i]);
            track[i].printType();
        }
        for (int i = 0; i < track.length; i++) {
            System.out.println(passengerCars[i]);
            passengerCars[i].printType();
        }
    }
//task2 Исключения------------------------------------------------------------------------------------------------------
    public static void doCheckCar(Bus[] bus, Truck[] truck, PassengerCar[] passengerCars) {
        for (int i = 0; i < bus.length; i++) {
            if(!bus[i].doCheckCar()) {
                try {
                    throw new RuntimeException("Автобус не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
        for (int i = 0; i < truck.length; i++) {
            if(!truck[i].doCheckCar()) {
                try {
                    throw new RuntimeException("Грузовик не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        for (int i = 0; i < passengerCars.length; i++) {
            if(!passengerCars[i].doCheckCar()) {
                try {
                    throw new RuntimeException("Автобус не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

//task2 Исключения------------------------------------------------------------------------------------------------------
}