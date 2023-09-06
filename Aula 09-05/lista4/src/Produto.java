public class Product {
    private String nameProduct;
    private double priceProduct;
    private int stockProduct;
aa
    public Product(private String nameProduct, private double priceProduct, private int stockProduct){
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.stockProduct = stockProduct;
    }

    public void buy(int purchase) {
        stockProduct += purchase;
        System.out.println("Compra de " + purchase + " unidades de " + nome + " realizada.");
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidadeEstoque) {
            quantidadeEstoque -= quantidadeVendida;
            System.out.println("Venda de " + quantidadeVendida + " unidades de " + nome + " realizada.");
        } else {
            System.out.println("Não há quantidade suficiente de " + nome + " em estoque.");
        }
    }
}
