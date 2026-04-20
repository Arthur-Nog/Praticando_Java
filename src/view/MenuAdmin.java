package view;
import service.AdminServico;
import service.GerenteServico;

import java.util.Scanner;

public class MenuAdmin {

    public void exibirMenuAdmin(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===== BEM VINDO AO MENU ADMIN =====");
            System.out.println("DECIDA QUAL AÇÃO: \n1- CONTRATAR GERENTE\n2- LISTAR GERENTE\n3- DEMITIR GERENTE\n4- VOLTAR PARA MENU ANTERIOR ");
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
