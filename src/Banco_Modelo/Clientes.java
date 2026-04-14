package Banco_Modelo;

public class Clientes extends Pessoas{
    int num_conta;
    String tipo_conta;

    public Clientes(String nome, String cpf, int num_conta, String tipo_conta){
        super(nome, cpf);
        this.num_conta = num_conta;
        this.tipo_conta = tipo_conta;
    }
}
