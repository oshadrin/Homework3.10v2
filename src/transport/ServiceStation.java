package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<Transport> transports = new ArrayDeque<>();


    private void addToQueue(Transport transport) {
        transports.offer(transport);
    }
    public void addPassengerCar(PassengerCar passengerCar){
        addToQueue(passengerCar);
    }
    public void addTruck(Truck truck){
        addToQueue(truck);
    }

    public void service() {
        while (!transports.isEmpty()){
        Transport transport = transports.poll();
            System.out.println("Техобслуживание автомобиля " + transport.getBrand());
        }
    }

}
