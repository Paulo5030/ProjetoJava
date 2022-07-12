//Quando	uma	variável	é	declarada	diretamente	dentro	do	escopo	da	classe,	é
//chamada	de	variável	de	objeto	ou	atributo.

public class Conta { // classe criada para definição.
    String titular;
    int numero;
    private double saldo; // atributo
    private double limite;

    //construtor
    Conta(String titular) {
        this.titular = titular;
    }

    Conta (int numero, String titular) {
        this(titular);
        this.numero = numero;
    }

    public double getSaldo(double saldo) {
      return this.saldo + this.limite;
    }

    public String getTitular(String titular) {
       return this.titular = titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

    void deposita (double quantidade) {
        this.saldo += quantidade; // += soma quantidade ao valor antigo do saldo e guarda	o valor	 resultante	no próprio saldo
    }

    boolean saca (double valor) { // metodo criado para sacar e não devolver nenhuma informação (palavra chave void) para quem acionar esse metodo.
        if (this.saldo < valor) {
            return false;
        }
        else {
              this.saldo = this.saldo - valor;
              return true;
        }

    }
}


class Programa {
    public static void main(String[] args) {
        String paulo = "Paulo";
        Conta c = new Conta(paulo);//Para criar, construir, instanciar basta usar a palavra-chave new
        System.out.println(c.titular);
        c.deposita(-250);


         if (c.saca(250)){
             System.out.println("Consegui sacar");
         } else {
             System.out.print("nao consegui sacar"); //se o valor do saque for maior que o saldo ele exibira o else
         }

    }
}



