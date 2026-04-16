package Banco_Modelo;

public class Admin implements Validacao {
    String login = "Admin";
    String senha = "123";

    public void criarGerente(String login, String senha){}


    @Override
    public void validaPessoas(String loginFornecido, String senhaFornecido) {
        if (loginFornecido.equals(login)){
            if (senhaFornecido.equals(senha)){
                System.out.println("Admin validado ! ");
            }else {
                System.out.println("Usuário ou senha incorreto");
            }
        }
    }
}


