import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //declarar e estanciar um objeto da classe scanner
        Scanner scanner = new Scanner(System.in);
        //declarar e estancear um objeto da classe random
        Random random = new Random();
        //decalrar outras variaveis
        int num1, num2, sum, attempt, bet, option;
        boolean hit;
        //repeticao do jogo
        do{
            num1 = random.nextInt(6) + 1;
            num2 = random.nextInt(6) + 1;
            sum = num1 + num2;
            System.out.println("- Número 1: " + num1 + "\n- Número 2: " + num2 + "\n- Soma: " + sum);
            attempt = 3;
            hit = false;
            //"!" significa não. Enqaunto o usuario nao acertar(hit) a repeticao sera feita novamente
            while(!hit && attempt > 0){
                System.out.print("\nInforme sua aposta: ");
                bet = scanner.nextInt();
                attempt--;
                if(sum == bet){
                    hit = true;
                }else{
                    System.out.println("Você errou! Tentativas restantes: " + attempt);
                }
            }
            if(hit){
                System.out.println("\nParabéns você acertou!!");
            }else{
                System.err.println("\nJogo encerrado!!");
            }
            System.out.println("Deseja recomeçar? (0 = Sim, 1 = Não)");
            option = scanner.nextInt();
        }while(option == 0);
    }
}
