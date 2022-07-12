public class TestaComputador {
    public static void main(String [] args) {
        Computador b = new Computador();
        b.ligado = b.liga();
        b.desligado = b.desliga();
        b.descanso = b.descansando();
        b.quantosComputadores();


    }
}
