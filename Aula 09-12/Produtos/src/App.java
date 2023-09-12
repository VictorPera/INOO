public class App {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product("Produto 1", 15.0, 0);
        Product p2 = new Product("Produto 2", 50.0, 10);

        p1.buy(10);
        p1.sell(15);
        p1.printStockQuantity();

        p2.buy(20);
        p2.sell(10);
        p2.printStockQuantity();
    }
}