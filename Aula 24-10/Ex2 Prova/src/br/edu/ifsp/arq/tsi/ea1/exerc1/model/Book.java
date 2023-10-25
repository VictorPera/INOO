package br.edu.ifsp.arq.tsi.ea1.exerc1.model;

public class Book {
    private int code;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private int pageNumber;
    private int stockQuantity;

    public Book(int code, String title, String author, String publisher, int publicationYear,
            int pageNumber, int stockQuantity) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.pageNumber = pageNumber;
        this.stockQuantity = stockQuantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Book [code=" + code + ", title=" + title + ", author=" + author + ", publisher="
                + publisher + ", publicationYear=" + publicationYear + ", pageNumber=" + pageNumber
                + ", stockQuantity=" + stockQuantity + "]";
    }
}
