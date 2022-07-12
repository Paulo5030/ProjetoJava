package br.com.caelum.casa;

public class Casinha {
    String cor;
    String porta1 = "Porta1";
    String porta2 = "Porta2";
    String porta3 = "Porta3";
    void pintar (Boolean pintando) {
        if (pintando) {
            System.out.println(porta2 + "\n"+ porta1 + "\n" + "Pintada (s)");

        }

    }

    void abrir (Boolean abrindo) {
        if(abrindo) {
            System.out.println(porta3 + " esta fechada");
        } else {
            System.out.println("A porta esta fehcada");
        }
    }


}

class TestandoCasinha {
    public static void main(String[]args) {
        Casinha Testando = new Casinha();
        Testando.pintar(true);
        Testando.abrir(true);
    }
}
