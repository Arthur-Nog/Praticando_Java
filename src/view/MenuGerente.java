package view;
import service.GerenteServico;

import java.util.Scanner;

public class MenuGerente {
    public void exibirMenu(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bem vindo");
            System.out.println("Decida qual opção: \n1- Cadastrar novo cliente\n2- Listar clientes\n3- Remover Cliente \n4- Voltar para menu anterior");
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
