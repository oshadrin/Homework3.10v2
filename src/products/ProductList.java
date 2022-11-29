package products;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {

    private Set<Product> products = new HashSet<>();

    public void printProductList () {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProduct (Product product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new RuntimeException("Такой продукт уже есть");
        }
        this.products.add(product);
    }

    public void checkBuy(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                product.setCheckBought();
                break;
            }
            
        }
    }

    public void removeProduct (String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals(name)) {
                productIterator.remove();
                break;
            }
        }
    }
}
