public class Casa {
    String cor;
    int porta1;
    int porta2;
    int porta3;

    void quantasPortasAbertas() {
        int portasAbertas = this.porta1 + this.porta2 + this.porta3;
        System.out.println("O número de portas abertas é: " + portasAbertas);
    }

    //Método que abre a porta selecionada
    int abre() {
        return 1;

    }

    //Método que fecha a porta selecionada
    int fecha() {
        return 0;
    }

    //Método que pinta a casa
    void pintar(String cor) {
        this.cor = cor;
        System.out.println("A casa foi pintada de: " + this.cor);
    }

}




