package transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sponsors sponsors = (Sponsors<?>) o;
        return Objects.equals(name, sponsors.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
