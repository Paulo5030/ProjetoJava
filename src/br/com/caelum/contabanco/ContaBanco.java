package br.com.caelum.contabanco;

public class ContaBanco {

    String titular;
    private double saldo = 1000;

    public double getSaldo() {
        return this.saldo;
    }
    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    public void saca(double valor) {
        if (valor < 0) {
            System.out.println("Saque invalido, valor do saque negativo!");
            return;

        }
        if (valor > saldo) {
            System.out.println("Valor do saque maior que o saldo!");
            return;
        }

            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso, saldo disponivel R$: " + getSaldo());


    }

    public void transferir1(ContaBanco conta1, double valor) {
        this.saca(valor);
        conta1.deposita(valor);
        System.out.println("Conta1 recebe: " + valor);

    }


}

class TestandoConta {
    public static void main(String[]args) {
        ContaBanco Testando = new ContaBanco();
        Testando.deposita(2500);
        Testando.saca(500);
        Testando.transferir1(Testando,2000);
    }
}
