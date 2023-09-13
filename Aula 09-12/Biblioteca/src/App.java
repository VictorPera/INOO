public class App {
    public static void main(String[] args) throws Exception {
        Livro b1 = new Livro("Java: Como programar", "Deitel", "Deitel", "Pearson", 2020, 1000);

        Livro b2 = new Livro("C: Como programar", "Deitel", "Pearson", 2010, 500);

        Livro b3 = new Livro("Sistemas Operacionais Modernos", "Deitel", "Deitel", "Pearson", 2005);

        Livro b4 = new Livro("Redes de Computadores", "Deitel", "Pearson", 2010);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
