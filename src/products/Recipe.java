package products;

import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String name;
    private final Set<Product> products;

    double sum;

    public Recipe(String name, double sum, Set<Product> products) {
        if (name == null || name.isBlank() || products ==null || products.size() == 0) {
            throw new  IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.products = products;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double recipeCost() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getCost();
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
