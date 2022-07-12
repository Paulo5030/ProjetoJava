package br.com.caelum.contabanco;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncinariosGerenciados;
   @Override
    public	double	getBonificacao() {
        return super.getBonificacao() + 1000;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncinariosGerenciados() {
        return numeroDeFuncinariosGerenciados;
    }

    public void setNumeroDeFuncinariosGerenciados(int numeroDeFuncinariosGerenciados) {
        this.numeroDeFuncinariosGerenciados = numeroDeFuncinariosGerenciados;
    }

    public boolean autentica(int senha) {
       if (this.senha == senha) {
           System.out.println("Acesso permitido");
           return true;
       }else {
           System.out.println("Acesso negado");
           return false;
       }

    }
}
