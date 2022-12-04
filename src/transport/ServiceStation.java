package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transports = new ArrayDeque<>();

    public ServiceStation() {

    }

    public Queue<Transport> getTransports() {
        return transports;
    }

    private void addToQueue(Transport transport) {
        transports.add(transport);
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
        transport.doCheckCar();
        }
    }

}
