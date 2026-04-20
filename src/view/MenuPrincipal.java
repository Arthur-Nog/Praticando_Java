package view;
import model.Cliente;
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
            System.out.println("=========BEM VINDO AO MENU PRINCIPAL!=========");
            System.out.println("DECIDA COM QUAL TIPO DE LOGIN DESEJA ENTRAR OU SAIR DO PROGRAMA \n1- [Cliente]\n2- [Gerente]\n3- [Admin]\n4- Sair do programa");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("DIGITE SEU LOGIN: ");
                    login = sc.nextLine();
                    System.out.println("DIGITE SUA SENHA: ");
                    senha = sc.nextLine();
                    loginValido = loginServico.validaLoginCliente(login, senha);
                    if(loginValido){
                        MenuCliente menuCliente = new MenuCliente();
                        menuCliente.exibirMenu(login);
                    }
                    break;
                case 2:
                    System.out.println("DIGITE SEU LOGIN: ");
                    login = sc.nextLine();
                    System.out.println("DIGITE SUA SENHA: ");
                    senha = sc.nextLine();
                    loginValido = loginServico.validaLoginGerente(login,senha);
                    if(loginValido){
                        MenuGerente menuGerente = new MenuGerente();
                        menuGerente.exibirMenu();
                    }
                    break;
                case 3:
                    System.out.println("DIGITE SEU LOGIN: ");
                    login = sc.nextLine();
                    System.out.println("DIGITE SUA SENHA: ");
                    senha = sc.nextLine();
                    loginValido = loginServico.validaLoginAdmin(login,senha);
                    if (loginValido){
                        MenuAdmin menuAdmin = new MenuAdmin();
                        menuAdmin.exibirMenuAdmin();
                    }else {
                        System.out.println("LOGIN OU SENHA INCORRETOS! ");
                    }
                    break;
            }
        }while (opcao !=4);
    }
}
