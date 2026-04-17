package service;

import model.Gerente;
import model.Pessoa;
import repositore.BancoDeDados;

import java.util.Scanner;

public class AdminServico {



    public static void cadastrarGerente(){
        Scanner sc = new Scanner(System.in);

        String nome,login,senha;
        int idade;
        double salario;

        System.out.println("Informe as seguintes informações do gerente: \n");
        System.out.println("Nome: ");
        nome = sc.nextLine();

        System.out.println("Idade: ");
        idade = sc.nextInt();

        System.out.println("Salario: ");
        salario = sc.nextDouble();
        sc.nextLine();
        System.out.println("Login: ");
        login = sc.nextLine();

        System.out.println("Senha: ");
        senha = sc.nextLine();
        Gerente gerente = new Gerente(nome,idade,salario,login,senha);
        System.out.println("Gerente criado: \n" + gerente);
        System.out.println("O gerente foi cadastrado com sucesso!");

    }

    public void listarGerentes(){
        int i=1;
        for (Gerente gerente : BancoDeDados.getGerentesBanco()){
            System.out.println("=========================\n");
            System.out.printf("Gerente %d :\n",i);
            System.out.printf("Nome gerente: %s\nLogin: %s\nSenha: %s",gerente.nome,gerente.getLogin(),gerente.getSenha());
            System.out.println("\n=========================");
            i += 1;
        }
    }
    public void demitirGerentes(){}
}
