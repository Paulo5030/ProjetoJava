package br.com.caelum.contas;

import br.com.caelum.contas.model.Cliente;
public class Banco {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Valor depositado " + valor);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        if (valor < 0) {
            System.out.println("Saque invalido!");
            return;
        }

        if (saldo > valor) {
            System.out.println("Saque invalido, saldo indisponivel!");
            return;
        }

        System.out.println("Voce sacou R$: " + valor);
        System.out.println("Saldo disponivel na conta R$: " + saldo);
    }

}

class teste {
    public static void main(String[]args) {
        Banco testando = new Banco();
        testando.deposita(100);
        testando.sacar(75);
        Cliente Paulo = new Cliente("Paulo", "Alameda dos Canarios", "345.546.78-2");
        Cliente Fabio = new Cliente("Fabio", "Alameda dos gentios", "654-462-897-1");
        System.out.println(Paulo);
        System.out.println(Fabio);



    }

}

