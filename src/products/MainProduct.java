package products;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainProduct {
    public static void main(String[] args) {

        Product banana = new Product("Бананы", 120);
        Product apple = new Product("Яблоки", 38);
        Product tomato = new Product("Помидоры", 240);

        ProductList productList = new ProductList();

        productList.addProduct(banana);
        productList.addProduct(apple);
        productList.addProduct(tomato);

        productList.printProductList();
        odd ();
    }

    private static void odd () {
    Set<Integer> numbers = new HashSet<>(20);
    Random random = new Random();
    while(numbers.size() < 20) {
        numbers.add(random.nextInt(100));
    }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
