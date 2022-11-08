package transport;

public class Sponsors<T extends Transport> {

    private final String name;

    private  final int amount;

    public void toSponsor(){
        System.out.println("Спонсор " + getName() + " спонсирует заезд на сумму: " + amount);
    }

    public Sponsors(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return getName();
    }
}
