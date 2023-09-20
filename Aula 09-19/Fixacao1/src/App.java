public class App {
    
    public static void main(String[] args) {
        String sugestao = "Pane"; // Sugestão da classe de impressão
        String mensagem = "Olá, mundo!";
        
        boolean impressaoBemSucedida = Saida.imprimir(sugestao, mensagem);
        
        if (impressaoBemSucedida) {
            System.out.println("Impressão bem-sucedida.");
        } else {
            System.out.println("Falha na impressão.");
        }
    }
}
