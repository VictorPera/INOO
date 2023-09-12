public class Product {

    private String name;
    private double unitPrice;
    private int stockQuantity;

    public Product(String name, double unitPrice, int stockQuantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void buy(int quantity){
        if(quantity > 0){
            stockQuantity += quantity;
            System.out.println("Compra realizada com sucesso!");
        }else{
            System.out.println("Quantidade deve ser maior que zero!");
        }
    }

    public void sell(int quantity){
        if(quantity > 0 && stockQuantity >= quantity){
            stockQuantity -= quantity;
            System.out.println("Venda realizada com sucesso!");
        }else{
            System.out.println("Quantidade em estoque insuficiente!");
        }
    }

    public void printStockQuantity(){
        System.out.println("Quantidade em estoque: " + stockQuantity);
    }

}