public class Computador {

    int ligado;
    int desligado;
    int descanso;

    void quantosComputadores() {
        int computadores = this.ligado + this.desligado + this.descanso;
        System.out.println("O numero de computadores é: " + computadores);
    }

    int liga () {
        return 1;
    }

    int desliga () {
        return 0;

    }

    int descansando() {
        return 3;
    }
}
