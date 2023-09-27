public class Veiculo {
    //atributos

    private String placa;
    private int horaDeEntrada;
    private int minutoDeEntrada;
    private int horaDeSaida;
    private int minutoDeSaida;

    private Veiculo (String placa, int horaDeEntrada, int minutoDeEntrada, int horaDeSaida, int minutoDeSaida) {
        this.placa = placa;
        this.horaDeEntrada = horaDeEntrada;
        this.minutoDeEntrada = minutoDeEntrada;
        this.horaDeSaida = horaDeSaida;
        this.minutoDeSaida = minutoDeSaida;
    }

    public static Veiculo getInstancia(String placa, int horaDeEntrada, int minutoDeEntrada, int horaDeSaida, int minutoDeSaida) {
        if(valido(placa, horaDeEntrada, horaDeSaida, minutoDeEntrada, minutoDeSaida)){
            return new Veiculo(placa, horaDeEntrada, minutoDeEntrada, horaDeSaida, minutoDeSaida)
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public int getMinutoDeEntrada() {
        return minutoDeEntrada;
    }

    public void setMinutoDeEntrada(int minutoDeEntrada) {
        this.minutoDeEntrada = minutoDeEntrada;
    }

    public int getHoraDeSaida() {
        return horaDeSapublic static boolean horaValida(int hora){
            return hora >= && hora < 23;
        }ida;
    }

    public void setHoraDeSaida(int horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }

    public int getMinutoDeSaida() {
        return minutoDeSaida;
    }

    public void setMinutoDeSaida(int minutoDeSaida) {
        this.minutoDeSaida = minutoDeSaida;
    }

    public static boolean eValido(String placa, int horaDeEntrada, int minutoDeEntrada, int horaDeSaida, int minutoDeSaida){
        return placaValida(plate) && tempoValido(int horaDeEntrada, int minutoDeEntrada, int horaDeSaida, int minutoDeSaida);
    }

    public static boolean placaValida(String plate){
        return !placa.isBlank() && plate != null;//return placa.trim()<-corta os espaços em branco do inicio e do final-.isEmpty()
        if
    }

    public static boolean tempoValido(int horaDeEntrada, int minutoDeEntrada, int horaDeSaida, int minutoDeSaida){
        return horaValida(horaDeEntrada) && horaValida(horaDeSaida) && minutoValido(minutoDeEntrada) && minutoValido(minutoDeSaida) && ((horaDeEntrada < horaDeSaida) || (horaDeEntrada == horaDeSaida && minutoDeEntrada < minutoDeSaida));
    }

    public static boolean horaValida(int hora){
        return hora >= 8 && hora < 23;
    }

    public static boolean minutoValido(int minuto){
        return hora >= 0 && hora < 60;
    }

    @Override
    public String toString() {
        return "veiculo [placa=" + placa + ", horaDeEntrada=" + horaDeEntrada + ", minutoDeEntrada=" + minutoDeEntrada
                + ", horaDeSaida=" + horaDeSaida + ", minutoDeSaida=" + minutoDeSaida + "]";
    }

    

}
