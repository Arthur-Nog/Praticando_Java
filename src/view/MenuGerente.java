package view;
import service.GerenteServico;

import java.util.Scanner;

public class MenuGerente {
    public void exibirMenu(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===== BEM VINDO AO MENU GERENTE =====");
            System.out.println("DECIDA QUAL AÇÃO: \n1- CADASTRAR CLIENTE\n2- LISTAR CLIENTES\n3- REMOVER CLIENTE \n4- VOLTAR MENU ANTERIOR");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    GerenteServico.cadastrarCliente();
                    break;
                case 2:
                    // Validação se a lista for nula
                    GerenteServico.listarClientes();
                    break;
                case 3:
                    GerenteServico.removerCliente();
                    break;
            }
        }while (opcao != 4);
    }
}
