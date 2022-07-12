package br.com.caelum.contabanco;

public class TestaGerente {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Gerente fucionario1 = new Gerente();
        fucionario1.setSalario(5000);
        controle.registra(fucionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBonificacoes());

    }
}
