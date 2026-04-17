package model;

public class Cliente extends Pessoa {
    int num_conta;
    String tipo_conta;
    double saldo;

    public Cliente(String nome, int idade, int num_conta, String tipo_conta, double saldo) {
        super(nome, idade);
        this.num_conta = num_conta;
        this.tipo_conta = tipo_conta;
        this.saldo = saldo;
    }

    public void validacaoCliente(){
    }
}
