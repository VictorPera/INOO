package br.edu.ifsp.arq.tsi.controller;

import br.edu.ifsp.arq.tsi.model.Product;

public class ProductsController {
    
    private static ProductsController instance;

    private ArrayList<Product> products;

    private ProductsController(){
        products = new ArrayList<>();
    }

    public static synchronized ProductsController getInstance() {
        if(instance == null){
            instance = new ProductsController();
        }
        return instance;
    }

    public boolean save(Product product){
        if(product != null){
            return products.add(product);
        }
        return false;
    }

    public Product findByName(String name){
        for(Product p: products){
            if(p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }

    public Product findByCode(String code){
        for(Product p: products){
            if(p.getCode().equalsIgnoreCase(code)){
                return p;
            }
        }
        return null;
    }

    public boolean update(Product product){
        int index = products.indexOf(product);
        if(index != -1){
            products.set(index, product);
            return true;
        }
        return false;
    }

    public boolean remove(Product product){
        return products.remove(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}
