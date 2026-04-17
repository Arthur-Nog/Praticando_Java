package view;
import service.AdminServico;

import java.util.Scanner;

public class MenuAdmin {

    public void exibirMenuAdmin(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bem vindo");
            System.out.println("Decida qual opção: \n1- Contratar gerente\n2- Listar Gerente\n3- Demitir gerente\n4- Voltar para menu anterior");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    AdminServico.cadastrarGerente();
                    break;
                case 2:
                    // Validação se a lista for nula
                    AdminServico.listarGerentes();
                    break;
                case 3:
                   AdminServico.demitirGerentes();
                    break;
            }
        }while (opcao != 4);
    }
}
