package Banco_Principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=========Bem vindo ao seu Banco!=========");
            System.out.println("Decida com qual tipo de login deseja entrar: \n1- Cliente\n2- Gerente\n3- Admin\n4- Sair do programa");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:

            }
        }while (opcao !=4);



    }
}
