package products;

import java.util.Objects;

public class Product {

    private String name;
    private double cost;
    private double weight;

    private boolean checkBought;


    public Product(String name, double cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCheckBought() {
        return checkBought;
    }

    public void setCheckBought() {
        this.checkBought = true;
    }

    public boolean isChecked() {
        return checkBought;
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
        return "Продукт: " + "название = " + name + ", цена= " + cost + ", вес= " + weight;
    }
}
