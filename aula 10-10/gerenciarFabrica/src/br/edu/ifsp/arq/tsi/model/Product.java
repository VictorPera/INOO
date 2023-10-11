package br.edu.ifsp.arq.tsi.model;

public class Product {
    private int codeProduct;
    private int storage;
    private String name;
    
    public Product(int codeProduct, int storage, String name) {
        this.codeProduct = codeProduct;
        this.storage = storage;
        this.name = name;
    }
    public int getCodeProduct() {
        return codeProduct;
    }
    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [codeProduct=" + codeProduct + ", storage=" + storage + ", name=" + name + "]";
    }
}


    