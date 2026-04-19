package view;
import service.ClienteServico;
import java.util.Scanner;


public class MenuCliente {
    public void exibirMenu(){
        int opcao,num;
        boolean validacao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========= Bem vindo ao menu CLIENTE =========");
            System.out.println("Decida qual opção: \n1- FAZER SAQUE\n2- FAZER DEPÓSITO\n3- EXTRATO DA CONTA \n4- EXIBIR INFORMAÇÕES \n5-VOLTAR PARA O MENU ANTERIOR");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA REALIZAR O SAQUE: ");
                    num = sc.nextInt();
                    ClienteServico.saque(num);
                    break;
                case 2:
                    System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA REALIZAR O DEPÓSITO: ");
                    num = sc.nextInt();
                    ClienteServico.deposito(num);
                    break;
                case 3:
                    ClienteServico.imprimirExtrato();
                    break;
                case 4:

            }
        }while (opcao != 5);
    }
}
