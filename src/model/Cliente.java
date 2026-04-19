package model;

public class Cliente extends Pessoa {
    int num_conta;
    String tipo_conta,login,senha;
    double saldo;

    public Cliente(){
        super();
    }

    public Cliente(String nome, int idade, int num_conta, String tipo_conta, double saldo,String login, String senha) {
        super(nome, idade);
        this.num_conta = num_conta;
        this.tipo_conta = tipo_conta;
        this.saldo = saldo;
        this.login = login;
        this.senha = senha;
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

    @Override
    public String toString() {
        return "Cliente -> "+ nome + "\nLogin -> " + login + "\nSenha -> " + senha + "\nNúmero da conta -> "+ num_conta +"\nSaldo -> " + saldo;
    }
}
