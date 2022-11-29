package products;

public class MainProduct {
    public static void main(String[] args) {

        Product banana = new Product("Бананы", 120, 5);
        Product apple = new Product("Яблоки", 38, 6);
        Product tomato = new Product("Помидоры", 240, 2);

        ProductList productList = new ProductList();

        productList.addProduct(banana);
        productList.addProduct(apple);
        productList.addProduct(tomato);

        productList.printProductList();
        //Не сделано: Создано непроверяемое исключение, которое выбрасывает ошибку в случае, если данные по объекту заполнены не полностью.
    }
}
