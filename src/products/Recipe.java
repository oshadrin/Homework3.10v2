package products;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {

    private final String name;
    private final Map<Product, Integer> products = new HashMap<>();

    double sum;

    public Recipe(String name, double sum) {
        if (name == null || name.isBlank()) {
            throw new  IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product, int sum) {
        if(sum <= 0) {
            sum = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + sum);
        } else {
            this.products.put(product, sum);
        }
    }

    public double recipeCost() {
        double sum = 0;
        for (Map.Entry<Product, Integer> product : this.products.entrySet()) {
            sum += product.getKey().getCost() * product.getValue() ;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
