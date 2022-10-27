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
import transport.Bus;
import transport.PassengerCar;
import transport.Transport;
import transport.Truck;

public class Main {

    public static void main(String[] args) {

        Bus[] bus = new Bus[4];
        Bus huge = new Bus("Man", "1212", 220);
        Bus big = new Bus("Scania", "X13", 200);
        Bus middle = new Bus("Mercedes", "GLS", 180);
        Bus small = new Bus("Ford", "DNN12", 150);
        bus[0] = huge;
        bus[1] = big;
        bus[2] = middle;
        bus[3] = small;

        Truck[] truck = new Truck[4];
        Truck one = new Truck("Volvo", "AM21", 350);
        Truck two = new Truck("Volvo", "AS33", 366);
        Truck three = new Truck("Mercedes", "GLR", 468);
        Truck four = new Truck("Kamaz", "1144", 420);
        truck[0] = one;
        truck[1] = two;
        truck[2] = three;
        truck[3] = four;

        PassengerCar[] passengerCar = new PassengerCar[4];
        PassengerCar black = new PassengerCar("Ford", "Focus", 120);
        PassengerCar red = new PassengerCar("MiniCooper", "S", 280);
        PassengerCar white = new PassengerCar("Mazda", "CX", 290);
        PassengerCar silver = new PassengerCar("Lada", "Largus", 98);
        passengerCar[0] = black;
        passengerCar[1] = red;
        passengerCar[2] = white;
        passengerCar[3] = silver;


        four.pitStop();
        white.bestTimeOfCircle();
        small.maxSpeed();

        printTransport(bus, truck, passengerCar);

        CategoryB ivan = new CategoryB("Ivanov Ivan Ivanovich", "B", 12, black);
        CategoryC petr = new CategoryC("Petrov Petr Petrovich", "C", 22, four);
        CategoryD alex = new CategoryD("Alekseev Aleksey Alexeevich", "D", 14, middle);

        ivan.drive();



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
    }

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
        }
        for (int i = 0; i < track.length; i++) {
            System.out.println(track[i]);
        }
        for (int i = 0; i < track.length; i++) {
            System.out.println(track[i]);
        }
    }
//
}