package service;

import model.Admin;
import model.Cliente;
import model.Gerente;
import repositore.BancoDeDados;

public class LoginServico {
    public boolean validaLoginAdmin(String loginFornecido, String senhaFornecido) {
        Admin admin1 = new Admin();
        admin1.setLogin("admin");
        admin1.setSenha("123");
        return loginFornecido.equals(admin1.getLogin()) && senhaFornecido.equals(admin1.getSenha());
    }

    public boolean validaLoginGerente(String loginFornecido, String senhaFornecida){
        for (Gerente gerente: BancoDeDados.getGerentesBanco()){
            if (loginFornecido.equals(gerente.getLogin())&&senhaFornecida.equals(gerente.getSenha())){
                return true;
            }
        }return false;
    }

    public boolean validaLoginCliente(String loginFornecido, String senhaFornecida){
        for (Cliente cliente : BancoDeDados.getClientesBanco()){
            if (loginFornecido.equals(cliente.getLogin()) && senhaFornecida.equals(cliente.getSenha())){
                return true;
            }
        }return false;
    }
}
