package br.com.caelum.porta;

public class Porta {
    public void abre(Boolean estaAberto) {
        if (estaAberto) {
            System.out.println("Esta aberto");

        } else {
            System.out.println("Esta Fechado");
        }
    }

    public void pintar(Boolean estaPintado) {
        if (estaPintado) {
            System.out.println("br.com.caelum.porta.Porta pintada");

        } else {
            System.out.println("nao esta");
        }
    }
}

class Testaporta{
    public static void main(String[] args){
        Porta porta = new Porta();
        porta.abre(false);
        porta.pintar(true);
    }
}