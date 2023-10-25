import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String iniciais = obterIniciais(nomeCompleto);

        System.out.println("Iniciais: " + iniciais);

        scanner.close();
    }

    public static String obterIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.split(" ");
        StringBuilder iniciais = new StringBuilder();

        for (String parte : partes) {
            // Verifica se a parte não é um conector ou preposição
            if (!parte.matches("e|do|da|dos|das|de|di|du")) {
                iniciais.append(parte.charAt(0));
            }
        }

        return iniciais.toString().toUpperCase();
    }

    
}
