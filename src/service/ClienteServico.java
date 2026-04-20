package service;

import model.Cliente;
import repositore.BancoDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServico {

    // ============ Validação ==========
    //NÃO SER NEGATIVO
    //NÃO COLOCAR


    public static void saque(Cliente cliente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTO DESEJA SACAR ?");
        double valorSaque = sc.nextDouble();
        if (valorSaque <= cliente.getSaldo()) {
            cliente.setSaldo(cliente.getSaldo() - valorSaque);
            BancoDeDados.adicionarMovimentoSaque(cliente, "Saque de " + valorSaque + " reais na conta de " + cliente.getNome());
        } else {
            System.out.println("SALDO INSUFICIENTE !");
        }
    }

    public static void deposito(Cliente cliente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTO VOCÊ DESEJA DEPOSITAR? ");
        double valorDeposito = sc.nextDouble();
        cliente.setSaldo(cliente.getSaldo() + valorDeposito);
        BancoDeDados.adicionarMovimentoDeposito(cliente, "Depósito de " + valorDeposito + " reais na conta de " + cliente.getNome());
    }

    public static void imprimirExtrato(Cliente clienteLogado) {
        System.out.println("=====EXTRATO DE " + clienteLogado.getNome() + "=====");
        ArrayList<String> movimentos = clienteLogado.getExtrato();
        if (movimentos.isEmpty()) {
            System.out.println("=====NENHUMA MOVIMENTAÇÃO REALIZADA=====");
        } else {
            for (String movimento : movimentos) {
                System.out.println(movimento);
            }
        }
    }
}