package Banco_Modelo;

public class Gerentes extends Pessoas{
    double salario;
    String login, senha;

    public Gerentes(String nome, int idade, double salario, String login, String senha) {
        super(nome, idade);
        this.salario = salario;
        this.login = login;
        this.senha = senha;

    }

    public void adicionarClientes(){
        System.out.println("Informe as seguintes informações do cliente: \n");
        System.out.println("Nome: \n");
        System.out.println("Idade: \n");
        System.out.println("Número da conta: ");
        System.out.println("Salario: \n");
    }

    public void validacaoGerente(){}

    public void imprimirInformacoes(Clientes cliente){

    }
}
