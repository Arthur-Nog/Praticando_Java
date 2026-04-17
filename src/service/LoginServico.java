package service;

import model.Admin;

public class LoginServico {
    public boolean validaLoginAdmin(String loginFornecido, String senhaFornecido) {
        Admin admin1 = new Admin();
        admin1.setLogin("admin");
        admin1.setSenha("123");

        return loginFornecido.equals(admin1.getLogin()) && senhaFornecido.equals(admin1.getSenha());
    }
}
