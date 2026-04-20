package repositore;

import model.Cliente;
import model.Gerente;

import java.util.ArrayList;

public class BancoDeDados {
    private static ArrayList<Cliente> clienteBanco = new ArrayList<>();
    private static ArrayList<Gerente> gerenteBanco = new ArrayList<>();

    public static ArrayList<Gerente> getGerentesBanco(){return gerenteBanco;}

    public static ArrayList<Cliente> getClientesBanco(){return clienteBanco;}

    public static void adicionarGerente(Gerente gerente) {
        gerenteBanco.add(gerente);
    }

    public static void adicionarCliente(Cliente cliente){
        clienteBanco.add(cliente);
    }
    public static void  adicionarMovimentoSaque(Cliente cliente,String movimentacao){
        cliente.getExtrato().add(movimentacao);
    }
    public static void  adicionarMovimentoDeposito(Cliente cliente,String movimentacao){
        cliente.getExtrato().add(movimentacao);
    }
}
