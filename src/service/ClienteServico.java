package service;

import model.Cliente;
import repositore.BancoDeDados;
import java.util.Scanner;

public class ClienteServico {

    // ============ Validação ==========
    //NÃO SER NEGATIVO
    //NÃO COLOCAR


    public static void saque(int numContaFornecido){
        Scanner sc = new Scanner(System.in);
        for (Cliente cliente : BancoDeDados.getClientesBanco()){
            if (numContaFornecido == cliente.getNum_conta()){
                System.out.println("Quanto você deseja sacar ?");
                Double valorSaque = sc.nextDouble();
                if (valorSaque <= cliente.getSaldo()){
                    double valorNovo = cliente.getSaldo() - valorSaque;
                    cliente.setSaldo(valorNovo);
                    BancoDeDados.adicionarMovimentoSaque(cliente,"Saque de " + valorSaque + " reais");
                }else {
                    System.out.println("Valor da conta insuficiente");
                }
            }
        }
    }

    public static void deposito(int numContaFornecido){
        Scanner sc = new Scanner(System.in);
        for (Cliente cliente : BancoDeDados.getClientesBanco()){
            if (numContaFornecido == cliente.getNum_conta()){
                System.out.println("Quanto você deseja depositar? ");
                double valorDeposito = sc.nextDouble();
                double valorNovo = cliente.getSaldo() + valorDeposito;
                cliente.setSaldo(valorNovo);
                BancoDeDados.adicionarMovimentoDeposito(cliente,"Depósito de " + valorDeposito + " reais");
            }
        }
    }

    public static void imprimirInfo(){

    }

    public static void imprimirExtrato(){
        for (String movimento: BancoDeDados.getExtratoBanco()){
            System.out.println(movimento);
        }
    }
}
