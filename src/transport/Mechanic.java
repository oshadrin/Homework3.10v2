package transport;

public class Mechanic <T extends Transport> {

    private final String name;
    private final String surname;
    private final String company;
    private String typeOfCar;



    public Mechanic(String name, String surname, String company, String typeOfCar) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.typeOfCar = typeOfCar;
    }

    public void service(T transport) {
        System.out.println("Механник " + getName() + " проводит техобслуживание автомобиля " + transport.getBrand() + " " + transport.getModel() );
    }
    public void repair(T transport) {
        System.out.println("Механник " + getName() + " проводит ремонт автомобиля " + transport.getBrand() + " " + transport.getModel() );
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return getName() + getSurname();
    }
}
