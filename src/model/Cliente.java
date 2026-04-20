package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    int num_conta;
    String tipo_conta,login,senha;
    double saldo;
    ArrayList<String> extrato = new ArrayList<>();

    public Cliente(){
        super();
    }

    public Cliente(String nome, int idade, int num_conta, String tipo_conta, double saldo,String login, String senha, ArrayList<String>listaMovimentacao) {
        super(nome, idade);
        this.num_conta = num_conta;
        this.tipo_conta = tipo_conta;
        this.saldo = saldo;
        this.login = login;
        this.senha = senha;
        this.extrato = listaMovimentacao;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    @Override
    public String toString() {
        return "NOME-> "+ nome + "\nLOGIN-> " + login + "\nSENHA-> " + senha + "\nNÚMERO DA CONTA-> "+ num_conta +"\nSALDO-> " + saldo+ "\n";
    }
}
