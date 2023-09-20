// Classe Saida.java
import javax.swing.JOptionPane;

public class Saida {
    
    // Método para imprimir uma string na tela usando System.out
    public static boolean imprimir(String sugestao, String mensagem) {
        if ("Sys".equalsIgnoreCase(sugestao)) {
            System.out.println(mensagem);
            return true;
        } else if ("Pane".equalsIgnoreCase(sugestao)) {
            JOptionPane.showMessageDialog(null, mensagem);
            return true;
        } else {
            System.err.println("Classe de impressão não reconhecida.");
            return false;
        }
    }
}
