package model;

public class Gerente extends Pessoa {
    private  double salario;
    private  String login, senha;

    public Gerente(String nome, int idade, double salario, String login, String senha) {
        super(nome, idade);
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }


    @Override
    public String toString() {
        return
                "salario ->" + salario +
                "\nlogin -> " + login + '\'' +
                "\nsenha -> " + senha + '\'' +
                "\nnome -> " + nome + '\'' +
                "\nidade -> " + idade;
    }
}
