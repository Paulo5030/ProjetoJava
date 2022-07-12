package br.com.caelum.pessoa;

public class Pessoa {
    String nome;
    int idade;

    void aniversario (double valor) {
        idade += valor;
    }
}

class FazendoAniversario {
    public static void main(String[] args) {
        Pessoa aniversarioPessoa;
        aniversarioPessoa = new Pessoa();
        aniversarioPessoa.nome = "Melissa";
        aniversarioPessoa.idade = 13;
        aniversarioPessoa.aniversario(13);

        System.out.println("Parabéns " + aniversarioPessoa.nome + " sua idade atual é: " + aniversarioPessoa.idade);
    }
}
