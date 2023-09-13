public class Livro {
    private String titulo;
    private String autor1;
    private String autor2;
    private String editora;
    private int anoDePublicacao;
    private int quantidadeDePaginas;

    public Livro(String titulo, String autor1, String editora, int anoDePublicacao) {
        this(titulo, autor1, "", editora, anoDePublicacao, 0);
    }

    public Livro(String titulo, String autor1, String editora, int anoDePublicacao, int quantidadeDePaginas){
        this(titulo, autor1, "", editora, anoDePublicacao, quantidadeDePaginas);
    }

    public Livro(String titulo, String autor1, String autor2, String editora, int anoDePublicacao){
        this(titulo, autor1, autor2, editora, anoDePublicacao, 0);
    }

    public Livro(String titulo, String autor1, String autor2, String editora, int anoDePublicacao, int quantidadeDePaginas) {
        this.titulo = titulo;
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    @Override
    public String toString() {
        return "Livro [título=" + titulo + ", autor 1=" + autor1 + ", autor 2=" + autor2 + ", editora=" + editora
        + ", ano de publicação=" + anoDePublicacao + ", número de páginas=" + quantidadeDePaginas + "]";
    }

}
