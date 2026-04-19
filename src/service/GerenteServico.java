package service;
import model.Cliente;
import repositore.BancoDeDados;

import java.util.Scanner;

public class GerenteServico {

    public static void cadastrarCliente(){
        Scanner sc = new Scanner(System.in);

        String nome,tipoConta,login,senha;
        int idade,numConta;
        double saldoConta;

        System.out.println("Para cadastrar novo cliente informe as seguintes informações: ");
        System.out.println("Nome: ");
        nome = sc.nextLine();

        System.out.println("Idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Número da conta: ");
        numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Tipo da conta: ");
        tipoConta = sc.nextLine();

        System.out.println("Saldo da conta: ");
        saldoConta = sc.nextDouble();
        sc.nextLine();
        System.out.println("Login: ");
        login = sc.nextLine();

        System.out.println("Senha: ");
        senha = sc.nextLine();

        Cliente cliente = new Cliente(nome,idade,numConta,tipoConta,saldoConta,login,senha);
        BancoDeDados.adicionarCliente(cliente);
    }

    public static void removerCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o login do gerente que deseja demitir: ");
        String  login = sc.nextLine();
        boolean removido = BancoDeDados.getClientesBanco().removeIf(cliente -> cliente.getLogin().equals(login));
        String mensagem = removido ? "===CLIENTE REMOVIDO===" : "===DIGITE UM LOGIN VÁLIDO===";
        System.out.println(mensagem);

    }

    public static void listarClientes(){
        int i = 1;
        for (Cliente cliente : BancoDeDados.getClientesBanco()){
            System.out.printf("========Cliente %d ========\n",i);
            System.out.println(cliente);
            i+= 1;
        }
    }


}
