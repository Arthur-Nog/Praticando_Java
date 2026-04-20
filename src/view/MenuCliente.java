package view;
import model.Cliente;
import repositore.BancoDeDados;
import service.ClienteServico;
import java.util.Scanner;


public class MenuCliente {
    public void exibirMenu(String login){
        int opcao;
        Scanner sc = new Scanner(System.in);
        Cliente clienteLogado = null;
        for(Cliente c : BancoDeDados.getClientesBanco()){
            if(login.equals(c.getLogin())){
                clienteLogado = c;
                break;
            }
        }
        if (clienteLogado == null){
            System.out.println("ERRO: CLIENTE NÃO ENCONTRADO !");
        }
        do {
            System.out.println("========= Bem vindo ao menu CLIENTE =========");
            System.out.println("DECIDA QUAL OPÇÃO: \n1- FAZER SAQUE\n2- FAZER DEPÓSITO\n3- EXTRATO DA CONTA \n4- EXIBIR INFORMAÇÕES \n5-VOLTAR PARA O MENU ANTERIOR");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("===== FAZENDO SAQUE =====");
                    ClienteServico.saque(clienteLogado);
                    break;
                case 2:
                    System.out.println("===== FAZENDO DEPÓSITO =====");
                    ClienteServico.deposito(clienteLogado);
                    break;
                case 3:
                    ClienteServico.imprimirExtrato(clienteLogado);
                    break;
                case 4:

            }
        }while (opcao != 5);
    }
}
