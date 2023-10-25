import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        // Conta o número de caracteres no texto
        int numCaracteres = texto.length();

        // Divide o texto em palavras usando espaços em branco como delimitadores
        String[] palavras = texto.split("\\s+");
        int numPalavras = palavras.length;

        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Número de palavras: " + numPalavras);

        scanner.close();
    }
}
