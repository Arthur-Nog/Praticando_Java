package repositore;

import model.Cliente;
import model.Gerente;

import java.util.ArrayList;

public class BancoDeDados {
    private static ArrayList<Cliente> clienteBanco = new ArrayList<>();
    private static ArrayList<Gerente> gerenteBanco = new ArrayList<>();

    public static ArrayList<Gerente> getGerentesBanco(){
        return gerenteBanco;
    }

    public static ArrayList<Cliente> getClientesBanco(){
        return clienteBanco;
    }
}
