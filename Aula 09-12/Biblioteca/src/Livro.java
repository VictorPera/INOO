public class Livro {
    private String titulo;
    private String autor1;
    private String autor2;
    private String editora;
    private int anoDePublicacao;
    private int quantidadeDePaginas;

    public Livro(String titulo, String autor1, String editora, int anoDePublicacao, int quantidadeDePaginas) {
        this(titulo, autor1, "", editora,)
    }

    public Livro(String titulo, String autor1, String autor2, String editora, int anoDePublicacao, int quantidadeDePaginas) {
        this.titulo = titulo;
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public
}
