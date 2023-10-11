package br.edu.ifsp.arq.tsi.view;

import br.edu.ifsp.arq.tsi.controller.ProductsController;
import br.edu.ifsp.arq.tsi.model.Product;

public class App {
    public static void main(String[] args) throws Exception {
        ProductsController controller = ProductsController.getInstance();

        if(controller.save(new Product("prego", "0025"))){
            System.out.println("Cadastro realizado com sucesso!");
        }else{
            System.out.println("Cadastro NÃO realizado!");
        }
        if(controller.save(new Product("arruela", "0369"))){
            System.out.println("Cadastro realizado com sucesso!");
        }else{
            System.out.println("Cadastro NÃO realizado!");
        }
        System.out.println("Relatório dos Produtos Cadastrados:");
        for(Product p: controller.getProducts()){
            System.out.println(p);
        }
        // buscar um Produto
        Product p1 = controller.findByName("prego");
        if(p1 != null){
            System.out.println(p1.getName() + " cadastrado.");
            p1.setName("Prego de Aço");
            if(controller.update(p1)){
                System.out.println(p1.getName() + " foi modificado.");
            }
            if(controller.remove(p1)){
                System.out.println("Removido com sucesso.");
            }
        }
        System.out.println("Relatório dos Produtos Cadastrados:");
        for(Product p: controller.getProducts()){
            System.out.println(p);
        }
    }
}
