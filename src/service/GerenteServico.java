package service;
import model.Cliente;
import repositore.BancoDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenteServico {

    public static void cadastrarCliente(){
        Scanner sc = new Scanner(System.in);

        String nome,tipoConta,login,senha;
        int idade,numConta;
        double saldoConta;
        ArrayList <String> movimentacao = new ArrayList<>();

        System.out.println("PARA CADASTRAR O CLIENTE INFORME AS SEGUINTES INFORMAÇÕES: ");
        System.out.println("NOME: ");
        nome = sc.nextLine();

        System.out.println("IDADE: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("NÚMERO DA CONTA: ");
        numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("TIPO DA CONTA: ");
        tipoConta = sc.nextLine();

        System.out.println("SALDO DA CONTA: ");
        saldoConta = sc.nextDouble();
        sc.nextLine();
        System.out.println("LOGIN: ");
        login = sc.nextLine();

        System.out.println("SENHA: ");
        senha = sc.nextLine();

        Cliente cliente = new Cliente(nome,idade,numConta,tipoConta,saldoConta,login,senha,movimentacao);
        BancoDeDados.adicionarCliente(cliente);
    }

    public static void removerCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O LOGIN DO CLIENTE QUE DESEJA REMOVER: ");
        String  login = sc.nextLine();
        boolean removido = BancoDeDados.getClientesBanco().removeIf(cliente -> cliente.getLogin().equals(login));
        String mensagem = removido ? "===CLIENTE REMOVIDO===" : "===DIGITE UM LOGIN VÁLIDO===";
        System.out.println(mensagem);

    }

    public static void listarClientes(){
        int i = 1;
        for (Cliente cliente : BancoDeDados.getClientesBanco()){
            System.out.printf("======== Cliente %d ========\n",i);
            System.out.println(cliente);
            i+= 1;
        }
    }


}
