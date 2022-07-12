package br.com.caelum.carro;

public class Carro {
    String cor;
    String modelo;
    String marca;
    double velocidadeAtual;
    double velocidadeMaxima;

public class Motor {
    int potencia;
    String tipo;
}
    //liga carro
    void liga() {
        System.out.println("br.com.caelum.carro.Carro ligado");
    }

    //acelera uma certa quantidade
    void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual = quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    //pegar a marcha do carro
    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }

}

class TestaCarro {
    public static void main(String [] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.modelo = "2022";
        meuCarro.marca = "HONDA";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        //liga o carro
        meuCarro.liga();

        //acelera o carro
        meuCarro.acelera(90);
        System.out.println("Sua velocidade é " + meuCarro.velocidadeAtual );

    }
}