package br.edu.ifsp.arq.tsi.ea1.exerc1.view;

import br.edu.ifsp.arq.tsi.ea1.exerc1.controller.BooksController;
import br.edu.ifsp.arq.tsi.ea1.exerc1.model.Book;

public class App {
  public static void main(String[] args) throws Exception {
    BooksController controller = BooksController.getInstance();

    if (controller.save(new Book(1, "Livro 1", "Autor 1", "Editora 1", 2000, 200, 10))) {
      System.out.println("Cadastro realizado com sucesso!");
    } else {
      System.out.println("Cadastro NÃO realizado!");
    }
    if (controller.save(new Book(1, "Livro 2", "Autor 2", "Editora 2", 2010, 250, 20))) {
      System.out.println("Cadastro realizado com sucesso!");
    } else {
      System.out.println("Cadastro NÃO realizado!");
    }
    if (controller.save(new Book(2, "Livro 2", "Autor 2", "Editora 2", 2010, 250, 20))) {
      System.out.println("Cadastro realizado com sucesso!");
    } else {
      System.out.println("Cadastro NÃO realizado!");
    }
    System.out.println("Relatório dos Livros Cadastrados:");
    for (Book b : controller.getBooks()) {
      System.out.println(b);
    }
    // pesquisa e alteração
    Book b1 = controller.findByTitle("Livro 1");
    if (b1 != null) {
      System.out.println(b1.getTitle() + " encontrado.");
      b1.setTitle("Livro 123");
      if (controller.update(b1)) {
        System.out.println(b1.getTitle() + " foi modificado.");
      }
    }
    // pesquisa e remoção
    Book b2 = controller.findByTitle("Livro 2");
    if (b2 != null) {
      System.out.println(b2.getTitle() + " encontrado.");
      if (controller.remove(b2)) {
        System.out.println("Livro removido com sucesso.");
      }
    }

    System.out.println("Relatório dos Livros Cadastrados:");
    for (Book b : controller.getBooks()) {
      System.out.println(b);
    }
  }
}
