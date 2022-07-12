public class TestarCasa {

    public static void main(String[] args) {

        Casa c = new Casa();


        c.porta2 = c.abre();
        c.quantasPortasAbertas();

        c.pintar("Verde");

        System.out.println("A casa agora está pintada de: " + c.cor);

        c.porta1 = c.fecha();
        c.quantasPortasAbertas();


    }
}
