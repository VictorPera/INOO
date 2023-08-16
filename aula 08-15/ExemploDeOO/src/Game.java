import java.util.Random;

public class Game {
    //Atributos
    private int num1;
    private int num2;
    private int sum;
    private int chances;
    private Random random;

    //Inicialização do construtor
    public Game() {
        //inicialização do construtor Random()
        random = new Random();

        //criação dos atributos
        num1 = random.nextInt(5) + 1;
        num2 = random.nextInt(6) + 1;
        sum = num1 + num2;

        //Inicialização do atributo chances
        chances = 3;
    }

    //Metodo Construtor
    //tipo scanf no C
    public int getChances(){
        return chances;
    }

    public boolean play(int bet){
        if(chances > 0){
            chances--;
            if(sum == bet){
                return true;
            }
        }
        return false;
    }

    @Override//anotação de sobreescrever
    public String toString() {
        return String.format("Número 1: %d - Número 2: %d - Soma: %d", num1, num2, sum);
    }

    //Metodo Acessador

    /*
        //tipo printf no C        () é parâmetro
        public void setChances(int chances){
            //this serve para acessar os atributos
            this.chances = chances
        }
    */
}