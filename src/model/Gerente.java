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

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void cadastarClientes(){
        System.out.println("Informe as seguintes informações do cliente: \n");
        System.out.println("Nome: \n");
        System.out.println("Idade: \n");
        System.out.println("Número da conta: ");
        System.out.println("Salario: \n");
    }

    public void validacaoGerente(){
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
