package products;

import java.util.Objects;

public class Product {

    private String name;
    private double cost;


    public Product(String name, double cost) {
        if (name == null || name.isBlank()) {
            throw new  IllegalArgumentException("Не заполнены все поля");
        }
        if (cost < 0) {
            throw new  IllegalArgumentException("Стоимость не может быть меньше нуля");
        }
        this.name = name;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Продукт: " + "название = " + name + ", цена= " + cost;
    }
}
