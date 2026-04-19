package model;

public class Gerente extends Pessoa {
    private  double salario;
    private  String login, senha;

    public Gerente(){
        super();
    }

    public Gerente(String nome, int idade, double salario, String login, String senha) {
        super(nome, idade);
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Gerente -> "+ nome + "\nLogin -> " + login + "\nSenha -> " + senha;
    }
}
