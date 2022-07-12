package br.com.caelum.contas.model;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private double saldo;

    public Cliente(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    /*
    public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);

        }
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {

    } */
}
