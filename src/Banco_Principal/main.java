package Banco_Principal;

import java.util.Scanner;
import Banco_Modelo.Admin;
public class main {
    public static void main(String[] args) {
        Admin admin1 = new Admin();

        int opcao;
        String login,senha;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=========Bem vindo ao seu Banco!=========");
            System.out.println("Decida com qual tipo de login deseja entrar: \n1- Cliente\n2- Gerente\n3- Admin\n4- Sair do programa");
            opcao = sc.nextInt();

            senha = sc.nextLine();

            switch (opcao){
                case 1:


                case 2:

                case 3:
                    System.out.println("Digite seu login: ");
                    login = sc.nextLine();
                    System.out.println("Digite sua senha: ");
                    senha = sc.nextLine();
                    admin1.validaPessoas(login,senha);
            }
        }while (opcao !=4);



    }
}
