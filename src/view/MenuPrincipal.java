package view;

import service.LoginServico;

import java.util.Scanner;
public class MenuPrincipal {

    public static void exibirMenu(){
        LoginServico loginServico = new LoginServico();

        int opcao;
        String login,senha;
        boolean loginValido;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=========Bem vindo ao seu Banco!=========");
            System.out.println("Decida com qual tipo de login deseja entrar: \n1- Cliente\n2- Gerente\n3- Admin\n4- Sair do programa");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao){
                case 1:

                case 2:
                    System.out.println("Digite seu login: ");
                    login = sc.nextLine();
                    System.out.println("Digite sua senha: ");
                    senha = sc.nextLine();
                    loginValido = loginServico.validaLoginGerente(login,senha);
                    if(loginValido){
                        MenuGerente menuGerente = new MenuGerente();
                        menuGerente.exibirMenu();
                    }
                    break;

                case 3:
                    System.out.println("Digite seu login: ");
                    login = sc.nextLine();
                    System.out.println("Digite sua senha: ");
                    senha = sc.nextLine();
                    loginValido = loginServico.validaLoginAdmin(login,senha);
                    if (loginValido){
                        MenuAdmin menuAdmin = new MenuAdmin();
                        menuAdmin.exibirMenuAdmin();
                    }else {
                        System.out.println("Login ou senha incorretos! ");
                    }
                    break;
            }
        }while (opcao !=4);
    }
}
