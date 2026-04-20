package service;

import model.Gerente;
import repositore.BancoDeDados;

import java.util.Scanner;

public class AdminServico {

    public static void cadastrarGerente(){
        Scanner sc = new Scanner(System.in);

        String nome,login,senha;
        int idade;
        double salario;

        System.out.println("INFORME AS SEGUINTES INFORMAÇÕES DO GERENTE: \n");
        System.out.println("NOME: ");
        nome = sc.nextLine();

        System.out.println("IDADE: ");
        idade = sc.nextInt();

        System.out.println("SALÁRIO: ");
        salario = sc.nextDouble();
        sc.nextLine();

        //VALIDAÇÃO LOGIN TEM QUE SER ÚNICO
        System.out.println("LOGIN: ");
        login = sc.nextLine();

        //VALIDAÇÃO SENHA MAIOR QUE 8 CARACTERES
        System.out.println("SENHA: ");
        senha = sc.nextLine();
        Gerente gerente = new Gerente(nome,idade,salario,login,senha);
        BancoDeDados.adicionarGerente(gerente);
        System.out.println("GERENTE CRIADO: \n" +"=====================\n" + gerente);
        System.out.println("=====================");
        System.out.println("O GERENTE FOI CRIADO COM SUCESSO!\n");

    }

    public static void listarGerentes(){
        int i=1;
        for (Gerente gerente : BancoDeDados.getGerentesBanco()){
            System.out.println("\n=========================");
            System.out.printf("GERENTE %d :\n",i);
            System.out.printf("NOME: %s\nLOGIN: %s\nSENHA: %s",gerente.getNome(),gerente.getLogin(),gerente.getSenha());
            System.out.println("\n=========================\n");
            i += 1;
        }
    }
    public static void demitirGerentes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O LOGIN DO GERENTE QUE DESEJA DEMITIR: ");
        String  login = sc.nextLine();
        boolean removido = BancoDeDados.getGerentesBanco().removeIf(gerente -> gerente.getLogin().equals(login));
        String mensagem = removido ? "===GERENTE DEMITIDO===\n" : "===DIGITE UM LOGIN VÁLIDO===\n";
        System.out.println(mensagem);
    }
}
