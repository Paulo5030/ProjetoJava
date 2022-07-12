package br.com.caelum.loja;

public class Loja {
    float VendasBlusas;
    float VendasCalcas;
    float VendasCamisas;

    void VendasResultados() {
        float ValorTotal = VendasBlusas + VendasCalcas + VendasCamisas;
        System.out.println("Esse foi o valor total de vendas do mes R$ " + ValorTotal);
    }
}

class ResultadosLoja {
    public static void main(String[]args) {
        Loja Resultado = new Loja();
        Resultado.VendasBlusas = 1000;
        Resultado.VendasCalcas = 1000;
        Resultado.VendasCamisas = 1000;
        Resultado.VendasResultados();

    }
}