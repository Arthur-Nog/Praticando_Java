package Banco_Modelo;
import java.util.Scanner;


public class Admin implements Validacao {
    String login = "Admin";
    String senha = "123";
    int opcao;


    public void menuAdmin(){
        System.out.println("Bem vindo " + this.login);
        System.out.println("Decida qual opção: \n1- Cadastrar gerente\n2- Voltar para menu anterior");
    }
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


