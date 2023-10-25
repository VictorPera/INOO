package br.edu.ifsp.arq.tsi.ea1.exerc1.controller;

import java.util.ArrayList;

import br.edu.ifsp.arq.tsi.ea1.exerc1.model.Book;

public class BooksController {
  private static BooksController instance;

  private ArrayList<Book> books;

  private BooksController() {
    books = new ArrayList<>();
  }

  public static synchronized BooksController getInstance() {
    if (instance == null) {
      instance = new BooksController();
    }
    return instance;
  }

  public Book findByTitle(String title) {
    for (Book b : books) {
      if (b.getTitle().equalsIgnoreCase(title)) {
        return b;
      }
    }
    return null;
  }

  public Book findByCode(int code) {
    for (Book b : books) {
      if (b.getCode() == code) {
        return b;
      }
    }
    return null;
  }

  public boolean isValidCode(int code) {
    for (Book b : books) {
      if (code == b.getCode()) {
        return false;
      }
    }
    return true;
  }

  public boolean save(Book book) {
    if (book != null) {
      if (isValidCode(book.getCode())) {
        return books.add(book);
      }
    }
    return false;
  }

  public boolean update(Book book) {
    int index = books.indexOf(book);
    if (index != -1) {
      books.set(index, book);
      return true;
    }
    return false;
  }

  public boolean remove(Book book) {
    return books.remove(book);
  }

  public ArrayList<Book> getBooks() {
    return books;
  }

}
