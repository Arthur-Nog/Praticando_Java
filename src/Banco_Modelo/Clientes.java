package Banco_Modelo;

public class Clientes extends Pessoas{
    int num_conta;
    String tipo_conta;
    double saldo;

    public Clientes(String nome, int idade, int num_conta, String tipo_conta,double saldo) {
        super(nome, idade);
        this.num_conta = num_conta;
        this.tipo_conta = tipo_conta;
        this.saldo = saldo;
    }

    public void validacaoCliente(){
    }
}
